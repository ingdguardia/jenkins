pipeline{
    agent any
        tools{
            maven "3.9.2"
        }
        stages{
            stage('test'){
            steps{
            dir("jenkins"){
                 sh 'mvn --version'
                 sh 'mvn clean compile test'

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










