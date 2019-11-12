pipeline {
  agent any
  stages {
    stage("Set git global credentials") {
      steps {
        bat 'git config --global user.email "javaprodigy56@gmail.com"'
        bat 'git config --global user.name "Kingsley Victor"'
      }
    }
    stage("Clean and package") {
      steps {
        bat 'mvn clean package -DskipTests'
      }
    }
    stage("Commit changes") {
      steps {
        bat 'git add .'
        bat 'git commit -m "push build  ``  [Finishes #169699626]"'
      }
    }
    stage("Deploy") {
      steps {
        bat 'git push heroku master'
      }
    }
  }
}