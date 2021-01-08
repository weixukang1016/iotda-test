package com.pvsoul.demo.iotdatest.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("api/datareceive")
@Component
@Slf4j
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataReceiveResource {

    @POST
    @Path("/pushdata")
    //@ApiOperation("实时轨迹点推送")
    public Response pushData(String data) {

        Date now = new Date();
        log.info("Now:"+ now.toString());
        log.info(data);
        return Response.status(Response.Status.OK).build();
    }

}
