<template>
  <div class="hello">
    <b-table dark striped hover :items="oko_circuitChauffageDatas"></b-table>
  </div>
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
      console.log(this.oko_circuitChauffageDatas)
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
