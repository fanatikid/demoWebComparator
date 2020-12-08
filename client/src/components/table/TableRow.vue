<template id="tablerow-template" xmlns="http://www.w3.org/1999/xhtml">
    <tr> <!-- 1 -->
      <td>{{ item.id }}</td>
      <td>{{ item.vertical }}</td>
      <td>{{ item.provider }}</td>
      <td>{{ item.isSponsored }}</td>
    </tr>
</template>

<script>
export default {
  props: ['item'] // <1>
}
</script>

<!-- Per Component Custom CSS Rules -->
<style>
  /* Add custom rules here */
</style>