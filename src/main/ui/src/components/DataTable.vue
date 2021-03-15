<template>
  <b-card
      title="CircuitChauffage"
      :sub-title="oko_circuitChauffageDatas[0].name"
      style="max-width: 50rem;"
  >
    <b-table dark striped hover responsive :items="oko_circuitChauffageDatas" :tbody-tr-class="rowClass"></b-table>

  </b-card>

</template>

<script>
export default {
  data(){
    return {
      oko_circuitChauffageDatas:[]
    }
  },
  created:function (){
    this.$http.get('http://localhost:8081/chaudiere/circuitChauffage').then(reponse=>{
      this.oko_circuitChauffageDatas=reponse.data
    })
    this.$http.get('http://localhost:8081/chaudiere/all').then(reponse=>{
      console.log(reponse)
    })
  },
  methods: {
    // ...
    rowClass(item, type) {
      if (item && type === 'row') {
        if (item.released === true) {
          return 'text-success'
        } else {
          return 'text-secondary'
        }
      } else {
        return null
      }
    }
  }
}
</script>

<style scoped>
.b-table{
  box-sizing: content-box;
}
</style>
