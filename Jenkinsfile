pipeline {
    agent any
    stages {
        stage('Build') { steps { bat 'javac BMICalc.java' } }
        stage('Run') { steps { bat 'java BMICalc' } }
    }
}
