import Vue from 'vue'
import Router from 'vue-router'
import ProductsComparator from '@/components/ProductsComparator'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Comparator',
      component: ProductsComparator
    }
  ]
})
