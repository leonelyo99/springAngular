package com.boolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	//constantes
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAwauueDb8xnNODiW66L4zEnulPKbxnIz/S65LhMED2o37QY3p\r\n" + 
			"cqe8sIa4DPkxJix/IQOJufi2fewv6vpJAKgUKPxPhBCVP3dwQVh9crM8HNpAsEef\r\n" + 
			"FhZSXWP+0jYgz+DGmlfCoXqL01Z3S2UWTNuTxrZXbBFjYWS3RKJsDq9qhRlm8Z+m\r\n" + 
			"/TxPEfIdCI+0ENj0kSpdxTp98lNTGtKjbtedZ92FD8R60j7EL610CdxXIwo7dMDE\r\n" + 
			"sKRGqdzaZkR7yQVnoUjRNAo3i+sU2n2CYcQA2VUVXyEAQytMlmJbIPsV0R5YmD2p\r\n" + 
			"qP4oyhqTgtM9tTu3GD9l3c+LhnzPlLjaiWlOdQIDAQABAoIBAHjuFKEn5Kqd8Q1Q\r\n" + 
			"bedKbGWMI1899vwD5p2BFdKtGxTrNwp17GEVb/LiDCa9qvzlJ/SbWvJu5LS4OCuH\r\n" + 
			"YPIyAXSeJ6CVIjxg/g0vjhWC6XQyq9XmwuVtxrxd5g2oktB60EgrqHJgLNMn2JGR\r\n" + 
			"a11OdnXMAcaPDPkRhIYszUBWNDMq0utZGJV0BkmYIyepQx4qWBn+k+8lUzBf4pjW\r\n" + 
			"kilAYofRWHWxLUSeb109ycZ+yCt+Z3jq5UQnWlG5Hwedum0HYwgT8gxCIwhGaZBM\r\n" + 
			"o9gRU4hBUZ+Ou7QmIGqj1URDXzv5KZKHkTmNFaXyOsaFXmDU8uJZCTF4IeITgxn4\r\n" + 
			"qGrT/oECgYEA/fixgkB817PdS9Y2uCZnMYtBD3/2hfNCPt2Xc2GSAuhvADJp5d+v\r\n" + 
			"qb8JgKvIu8Zi1w3Yrf9et350NKvC8/Jw5e5xzEbjC3LATWeYxpSCIaQr+QDOkyC6\r\n" + 
			"ub1FrYj1oTBAblSJa+X6VJFvze4ZJcUeusnmOBQHwLXfhf4Dt+ouV6UCgYEAwzew\r\n" + 
			"OVcpkPsspahUVl2kYdF7xF6OXFQtLI6mQXtLqRXFn4IFeMwzRKf8DRCGsm596QEV\r\n" + 
			"t6Kd42QXASI8J0s9UBfqQuUk+YLkxxTeE5dgAJqP1PWPX/3oKyWoDtiQkBIIKDlP\r\n" + 
			"8yKzqNy4VHJBrRmeUeCY1z4EekOMwJPLOnKC4pECgYEAlReO1WEYKOS9D80UWGyq\r\n" + 
			"/cm7CudbCG2ywQcC5sgrmCttJldyFXGIRQUSBghSkfE3ivnk7thQeTXx8A25J852\r\n" + 
			"enTNN1eR5+GYhJhBdqot7qPa8JWJr5NyKqGzKtmRIOwblulntwDOQSET2ndhKewb\r\n" + 
			"SxpFXTxdBMOAEb/53NjMFcUCgYEArZFs2H6b0XDRMHSqj6NwjRwxG9YqYwLgq1Yl\r\n" + 
			"keDq02otLHXxIYcFKkzlOERyTmEZB7rUMVKfaNbL8VEcBJ/L4tNwkIulxUZQ3IS8\r\n" + 
			"MtULIV5K9cBi+qkI7JvtgU2hssalhAX5BKbc8A1WwpZXuG0nq4qyueVFG+PFWE/P\r\n" + 
			"iKbZolECgYA0IuSIsEyDXqnXykyozX45Hu9od7pwRr8ZCt8vVoHlb2RCB32EvioL\r\n" + 
			"QsS11HedWbWMjfpmoY/SW5nYA+f/9Hs40PK0p3Sh9s4qqJFQlB3eQLygBAvyAsGa\r\n" + 
			"U+nb3OHBCZu40atFBCsDO/xLPu+w/vIyr+0B4/fut8Q+oh27ml2hPg==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwauueDb8xnNODiW66L4z\r\n" + 
			"EnulPKbxnIz/S65LhMED2o37QY3pcqe8sIa4DPkxJix/IQOJufi2fewv6vpJAKgU\r\n" + 
			"KPxPhBCVP3dwQVh9crM8HNpAsEefFhZSXWP+0jYgz+DGmlfCoXqL01Z3S2UWTNuT\r\n" + 
			"xrZXbBFjYWS3RKJsDq9qhRlm8Z+m/TxPEfIdCI+0ENj0kSpdxTp98lNTGtKjbted\r\n" + 
			"Z92FD8R60j7EL610CdxXIwo7dMDEsKRGqdzaZkR7yQVnoUjRNAo3i+sU2n2CYcQA\r\n" + 
			"2VUVXyEAQytMlmJbIPsV0R5YmD2pqP4oyhqTgtM9tTu3GD9l3c+LhnzPlLjaiWlO\r\n" + 
			"dQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
