/**
 * 
 */
package main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Jay
 *
 */

@Path("/user")
public class UserDetails {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName()
	{
		String name ="Jai";
		return name;
	}
}
