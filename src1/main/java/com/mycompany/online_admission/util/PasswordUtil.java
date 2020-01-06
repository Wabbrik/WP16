package com.mycompany.online_admission.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PasswordUtil {
    private static final Logger LOG =Logger.getLogger(PasswordUtil.class.getName());
    public static String convertToSha256(String password){
        MessageDigest messageDigest;
        try{
            messageDigest=MessageDigest.getInstance("SHA-256");
            messageDigest.update(password.getBytes());
            byte[] digest=messageDigest.digest();
            String result=new BigInteger(1,digest).toString(16);
            return result;
        }
        catch(NoSuchAlgorithmException ex){
            LOG.log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
}
