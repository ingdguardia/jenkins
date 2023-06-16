pipeline{
    agent any
        stages{
            stage('test'){
            steps{
            dir("jenkins"){
                 sh "mvn clean compile test"

            }
                }
            }
            stage('Build application'){
            steps{
                echo "mvn clean install -Dmaven.test.skip=true"
            }
            }
            //stage('Create docker image'){
           // steps{
             //   echo "creando docker"
           // }
            //}
    }
}










