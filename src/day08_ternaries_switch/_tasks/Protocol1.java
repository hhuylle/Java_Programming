package day08_ternaries_switch._tasks;

public class Protocol1 {

    public static void main(String[] args) {

        int statusCode = 403;

        String result = statusCode==200? "OK": statusCode==201? "Created": statusCode==202? "Accepted": statusCode==301? "Moved Permanently": statusCode==303? "See Other": statusCode==304? "Not Modified": statusCode==307? "Temporary Redirect": statusCode==400? "Bad Request": statusCode==401? "Unauthorized0": statusCode==403? "Forbidden": statusCode==404? "Not Found": statusCode==410? "Gone": statusCode==500? "Internal Server Error": statusCode==503? "Service Unavailable": "Invalid Status Code";

        System.out.println(result);


    }
}
