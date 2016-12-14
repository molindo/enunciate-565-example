/**
 * This copy of Woodstox XML processor is licensed under the
 * Apache (Software) License, version 2.0 ("the License").
 * See the License for details about distribution rights, and the
 * specific rights regarding derivate works.
 *
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/
 *
 * A copy is also included in the downloadable source code package
 * containing Woodstox, in file "ASL2.0", under the same directory
 * as this file.
 */
package at.molindo.enunciate.example;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import com.webcohesion.enunciate.metadata.rs.TypeHint;

@Path("/1.0")
@Produces({ "application/xml", "application/json" })
public interface Api {

	/**
	 * get a Tweet by its ID
	 */
	@GET
	@Path("/{id}")
	@TypeHint(Tweet.class)
	Response get(@PathParam("id") String id);


}
