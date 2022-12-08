import Home from './pages/Home.vue'
import InsertForm from './pages/InsertForm.vue'
import UpdateForm from './pages/UpdateForm.vue'
import SuccessForm from './pages/SuccessForm.vue'

export default [
    {
        path: "/",
        component: Home
    },
    {
        path: "/insert",
        component: InsertForm
    },
    {
        path: '/update/:id',
        component: UpdateForm,
        name: 'updateData'
    },
    {
        path: '/success',
        component: SuccessForm
    }
]
    