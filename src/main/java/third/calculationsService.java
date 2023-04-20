package third;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@PermitAll
@Stateless
@Path("test")
public class calculationsService {
	@Inject
	private database db;
	@POST
	@Path("calc")
	public int calculate(calculation c) {
		int results=0;
		if(c.getX().equals("+"))
		{
			results=c.getN1()+c.getN2();
			
		}else if(c.getX().equals("-"))
		{
			results=c.getN1()-c.getN2();
		}else if(c.getX().equals("*"))
		{
			results=c.getN1()*c.getN2();
		}else if(c.getX().equals("/"))
		{
			if(c.getN2()==0)
			{
				throw new IllegalArgumentException("second number is zero");
			}else {
				results=(c.getN1() / c.getN2());
			}
		}else {
			throw new IllegalArgumentException("operation not availbe");
		}
		db.insertoDB(c);
		return results;
	}
	@GET
	@Path("findcalculation")
    public List<calculation> FindCalculations() {
        return db.findCalculations();
    }
    @GET
    @Path("hello")
    public String print() {
    	return "hello";
    }
}
