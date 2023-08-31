package day08_ifStatement_switch_ternary;

public class Protocols {
    public static void main(String[] args) {

        int statusCode = 600;
        String result;

        switch (statusCode){
            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result ="See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirected";
                break;
            case 400:
                result = " Bad Request";
                break;
            case 401:
                result= "Unauthorised";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result ="Internal Server Error";
                break;
            case 503:
                result ="Service Unavailable";
                break;
            default:
                result ="Invalid Status Code";

        }
        System.out.println(result);

    }
}
/*
8. HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent
page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable
 */