<template id="fulltable-template" xmlns="http://www.w3.org/1999/xhtml">
  <table class="table">
    <thead class="thead-inverse">
      <tr>
        <th>ID</th>
        <th>Vertical</th>
        <th>Provider</th>
        <th>IsSponsored</th>
      </tr>
    </thead>
    <!--1-->
    <table-row
      v-for="product in products"
      :item="product"
      :key="product.id"
    ></table-row>
    <!--2-->
  </table>
</template>

<script>
import TableRow from "./TableRow.vue"; // <3>
export default {
  props: ["products"],
  components: {
    // <3>
    TableRow,
  },
};
</script>

<style>
/* Add custom rules here */
</style>