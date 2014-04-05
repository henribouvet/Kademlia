package kademlia.util.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A class that is used to calculate the hash of strings.
 *
 * @author Joshua Kissoon
 * @since 20140405
 */
public class HashCalculator
{

    /**
     * Computes the SHA-1 Hash.
     *
     * @param toHash The string to hash
     *
     * @return byte[20] The hashed string
     *
     * @throws java.security.NoSuchAlgorithmException
     */
    public static byte[] sha1Hash(String toHash) throws NoSuchAlgorithmException
    {
        /* Create a MessageDigest */
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        /* Add password bytes to digest */
        md.update(toHash.getBytes());

        /* Get the hashed bytes */
        return md.digest();
    }

    /**
     * Computes the MD5 Hash.
     *
     * @param toHash The string to hash
     *
     * @return byte[16] The hashed string
     *
     * @throws java.security.NoSuchAlgorithmException
     */
    public byte[] md5Hash(String toHash) throws NoSuchAlgorithmException
    {
        /* Create a MessageDigest */
        MessageDigest md = MessageDigest.getInstance("MD5");

        /* Add password bytes to digest */
        md.update(toHash.getBytes());

        /* Get the hashed bytes */
        return md.digest();
    }
}
