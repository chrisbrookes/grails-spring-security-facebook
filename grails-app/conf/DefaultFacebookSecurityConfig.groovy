security {

	facebook {

        appId = "Invalid"
        secret = 'Invalid'
        apiKey = 'Invalid'

        domain {
            classname = 'FacebookUser'
            appUserConnectionPropertyName = "user"
        }

        useAjax = true
        autoCheck = true

        jsconf = "fbSecurity"

        //see http://developers.facebook.com/docs/authentication/permissions/
        permissions = ["email"]

        taglib {
            language = "en_US"
            button {
                text = "Login with Facebook"
                defaultImg = "/images/connect.png"
            }
            initfb = true
        }

        autoCreate {
            active = true
            roleNames = ['ROLE_USER', 'ROLE_FACEBOOK']
        }

        filter {
            json {
                processUrl = "/j_spring_security_facebook_json"
            }
            redirect {
                redirectFromUrl = "/j_spring_security_facebook_redirect"
            }
            processUrl = "/j_spring_security_facebook_check"
            type = 'redirect' //transparent, cookieDirect, redirect or json
            position = 720 //see SecurityFilterPosition
            forceLoginParameter = 'j_spring_facebook_force'
        }

        beans {
            //successHandler =
            //failureHandler =
            //redirectSuccessHandler =
            //redirectFailureHandler =
        }

    }
}