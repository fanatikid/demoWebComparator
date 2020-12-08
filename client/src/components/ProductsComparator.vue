<!--tag::template[]-->
<template>
  <div id="comparator">
    <app-header></app-header>
    <product-table :products="products"></product-table>
    <!--2-->
  </div>
</template>
<!--end::template[]-->
<!--tag::component[]-->
<script>
import AppHeader from "./AppHeader"; // <1>
import ProductTable from "./table/ProductTable";
export default {
  components: {
    // <1>
    AppHeader,
    ProductTable,
  },
  data: function () {
    // <2>
    return {
      products: [],
      product: { name: "", vertical: null, provider: null, isSponsored: null },
      verticals: [],
      providers: [],
      isSponsored: false,
      serverURL: process.env.VUE_APP_SERVER_URL, // <3>
    };
  },
  // end::component[]
  // tag::fetch[]
  created() {
    // <1>
    this.fetchData();
  },
  methods: {
    fetchData: async function () {
      // <2>
      try {
        Promise.all([
          // <3>
          this.fetchProducts(),
          this.fetchVerticals(),
          this.fetchProviders()
        ]);
      } catch (error) {
        // eslint-disable-next-line no-console
        console.error(error);
      }
    },
    // end::fetch[]
    // tag::methods[]
    fetchProducts: function () {
      // <1>
      fetch(`${this.serverURL}/product`)
        .then((r) => r.json())
        .then((json) => {
          this.products = json;
        })
        // eslint-disable-next-line no-console
        .catch((error) => console.log("Error retrieving products: " + error));
    },
    fetchVerticals: function () {
      fetch(`${this.serverURL}/vertical`)
        .then((r) => r.json())
        .then((json) => {
          this.verticals = json;
        })
        // eslint-disable-next-line no-console
        .catch((error) => console.log("Error retrieving models: " + error));
    },
    fetchProviders: function () {
      fetch(`${this.serverURL}/provider`)
        .then((r) => r.json())
        .then((json) => {
          this.providers = json;
        })
        // eslint-disable-next-line no-console
        .catch((error) => console.error("Error retrieving makes: " + error));
    },
    // end::methods[]
  },
};
</script>

<!--tag::css[]-->
<!-- Per Component Custom CSS Rules -->
<!--1-->
<style>
#comparator {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  text-align: center;
  color: #2c3e50;
}
</style>
<!--end::css[]-->