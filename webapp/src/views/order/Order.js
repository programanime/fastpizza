import React from 'react'
import { useEffect, useState } from 'react'
import Swal from 'sweetalert2'
import {
  CButton,
  CCard,
  CCardBody,
  CCardFooter,
  CCardHeader,
  CCol,
  CForm,
  CFormCheck,
  CFormInput,
  CFormTextarea,
  CFormLabel,
  CImage,
  CSelect,
  CFormSelect,
  CRow,
} from '@coreui/react'
import { CChartLine } from '@coreui/react-chartjs'
import { axiosClient } from '../../api'
import { PizzaSize } from '../../constants'

const Order = () => {
  const [pizza, setPizza] = useState(window.pizza || {})
  const [size, setSize] = useState('MEDIUM')
  const [total, setTotal] = useState(pizza?.price || 0)
  const [toppings, setToppings] = useState([])
  const buy = () => {
    debugger
    Swal.fire('Done!')
  }
  const calculateTotal = (size, toppings) => {
    const toppingValue = toppings.filter((t) => t.checked).reduce((total, t) => t.price, 0)
    setTotal(pizza.price * PizzaSize[size] + toppingValue)
    setSize(size)
    setToppings(toppings)
  }

  const addTopping = (topping) => {
    topping.checked = !topping.checked
    calculateTotal(size, [...toppings])
  }

  useEffect(() => {
    const call = async () => {
      const { data } = await axiosClient.get('toppings')
      setToppings(data._embedded.toppings)
    }
    call()
  }, [])

  return (
    <>
      <CCard className="mb-4">
        <CCardHeader>{pizza.name}</CCardHeader>
        <CCardBody>
          <CRow>
            <CForm>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Pizza Size</CFormLabel>
                <CFormSelect
                  value={size}
                  aria-label="Default select example"
                  onChange={(e) => calculateTotal(e.target.value, toppings)}
                >
                  {Object.keys(PizzaSize).map((size) => (
                    <option key={size} value={size}>
                      {size}
                    </option>
                  ))}
                </CFormSelect>
              </div>
              <CRow>
                <CCol sm={4}>
                  <CFormLabel htmlFor="exampleFormControlInput1">Toppings</CFormLabel>
                  {toppings.map((topping) => (
                    <CFormCheck
                      key={topping.name}
                      label={topping.name + ' - $' + topping.price}
                      name={topping.name}
                      checked={topping.checked}
                      onChange={() => addTopping(topping)}
                    />
                  ))}
                </CCol>
                <CCol sm={4}>
                  <CImage fluid src={pizza.imageUrl} className="pizza" />
                </CCol>
              </CRow>
              <div className="mb-3">
                <br />
                <CFormLabel htmlFor="exampleFormControlTextarea1">
                  Indications (Optional)
                </CFormLabel>
                <CFormTextarea id="exampleFormControlTextarea1" rows="2"></CFormTextarea>
              </div>
            </CForm>
          </CRow>
          <CCardFooter>
            <CFormLabel>Total : ${total.toFixed(2)}</CFormLabel>
            <CButton color="outline-success" className="mx-4" onClick={() => buy(pizza)}>
              Buy
            </CButton>
          </CCardFooter>
        </CCardBody>
      </CCard>
    </>
  )
}

export default Order
