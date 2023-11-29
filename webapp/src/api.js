import axios from 'axios'
import { API_URL } from './constants'

export function getApiUrl() {
  return API_URL
}

export const axiosClient = axios.create({
  baseURL: getApiUrl(),
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
  withCredentials: true,
})

export const UserTypes = {
  CLIENT: 'CLIENT',
  ADMIN: 'ADMIN',
}

export const SIMPLE_GET_OPTIONS = {
  method: 'GET',
  headers: new Headers({
    Accept: 'application/json',
  }),
}

export const GET_OPTIONS = {
  method: 'GET',
  credentials: 'include',
  headers: new Headers({
    Accept: 'application/json',
  }),
}

export const POST_OPTIONS = {
  method: 'POST',
  credentials: 'include',
  headers: new Headers({
    Accept: 'application/json',
    'Content-Type': 'application/json',
  }),
}

export const DELETE_OPTIONS = {
  method: 'DELETE',
  credentials: 'include',
  headers: new Headers({
    Accept: 'application/json',
  }),
}

export const PUT_OPTIONS = {
  method: 'PUT',
  credentials: 'include',
  headers: new Headers({
    Accept: 'application/json',
    'Content-Type': 'application/json',
  }),
}

export const SIMPLE_POST_OPTIONS = {
  method: 'POST',
  headers: new Headers({
    Accept: 'application/json',
  }),
}

export const AXIOS_OPTIONS = {
  withCredentials: true,
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
}
