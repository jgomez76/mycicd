node ('built-in') {
    properties([
        parameters([
            booleanParam(name: 'DEBUG_ENABLED', defaultValue: false)
        ]
        ),
        disableConcurrentBuilds(),
        buildDiscarder(logRotator(daysToKeepStr: '30')),
        pipelineTriggers([
            [$class: 'GenericTrigger',
                genericVariables: [
                    [key: 'ref', value: '$.ref'],
                    [key: 'origin_branch', value: '$.ref'],
                    [key: 'commits_0_id', value: '$.commits[0].id'],
                    [key: 'project_name', value: '$.repository.name']
                ],
                printContributedVariables: true,
                silentResponse: false,
                token: "${JOB_NAME}",

            ]
        ])
    ])
}
