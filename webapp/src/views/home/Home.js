import React from 'react'
import { useDispatch } from 'react-redux'
import { useNavigate } from 'react-router-dom'
import { useEffect, useState } from 'react'
import {
  CButton,
  CCard,
  CCardBody,
  CCardFooter,
  CCardHeader,
  CCol,
  CImage,
  CRow,
} from '@coreui/react'
import { CChartLine } from '@coreui/react-chartjs'
import { axiosClient } from '../../api'

const Home = () => {
  const dispatch = useDispatch()
  const [data, setData] = useState([])
  const navigate = useNavigate()
  const buy = (pizza) => {
    dispatch({ type: 'setPizza', pizza })
    navigate('/order')
  }
  useEffect(() => {
    const call = async () => {
      const { data } = await axiosClient.get('pizzas')
      setData(data._embedded.pizzas)
    }
    call()
  }, [])

  return (
    <>
      <CCard className="mb-4">
        <CCardBody>
          <CRow>
            {data.map((pizza) => (
              <CCol sm={4} key={pizza.id}>
                <CCard className="mb-4">
                  <CCardHeader>
                    <strong>{pizza.name}</strong>
                  </CCardHeader>
                  <CCardBody>
                    <CImage fluid src={pizza.imageUrl} className="pizza" />
                  </CCardBody>
                  <CCardFooter>
                    <CButton color="outline-secondary" className="mx-0">
                      $ {pizza.price}
                    </CButton>
                    <CButton color="outline-success" className="mx-4" onClick={() => buy(pizza)}>
                      Buy
                    </CButton>
                  </CCardFooter>
                </CCard>
              </CCol>
            ))}
          </CRow>
        </CCardBody>
      </CCard>
    </>
  )
}

export default Home
