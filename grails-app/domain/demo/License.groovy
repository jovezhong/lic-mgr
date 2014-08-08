package demo

import grails.rest.*

@Resource(uri='/licenses',formats=['json', 'xml'])
class License {

    String user
    String email
    String sn
    Date generatedOn=new Date()

    static constraints = {
        user blank:false
        email blank:false
        sn blank:false
    }
}
