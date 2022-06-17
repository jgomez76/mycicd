#!/usr/bin/env grrovy

def call(lib) {
    ansiColor('xterm') {
        timestamps {
            def propsIBD
            def mailTo = env.MAIL_SUCCESS
            def mailBodyOnError = ''

            try {
                currentBuild.description = "${env.gitRequest_head_commit_message}"

                currentBuild.rawBuild.@result = hudson.model.Result.SUCCESS
                
            } catch (err) {
                println "ha dado error el call"

            } finally {
                println "entro en finally"
            }
        }
    }
}