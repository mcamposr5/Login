nodo {
  etapa ('SCM') {
    pagar scm
  }
  stage ('Análisis de SonarQube') {
    def mvn = herramienta 'Maven predeterminado';
    withSonarQubeEnv () {
      sh "$ {mvn} / bin / mvn sonar: sonar"
    }
  }
}
