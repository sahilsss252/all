package com.lti.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.lti.model.Passenger;
import com.lti.model.Passenger.Gender;
import com.lti.model.Passenger.Status;
import com.lti.model.PnrStatus;

/**
 * 
 * 
 *
 * @author IRCTC
 *
 */


@Path("/pnr")
public class PnrService {
	
	@GET// which method of hTTP{GET,POST,PUT,DELETE}
	
	@Produces("application/json")
	public PnrStatus getstatus(@QueryParam("pnrNo") long pnrNo,@Context HttpServletResponse response){
		//How the client send the pnrNo?(QueryParam/PathParam/MatrixParam)
		
		
		
		//in real system we might invoke some Dao class from here to get the pnr status from the database 
		//and then return it 
		
		response.setHeader("Access-Control-Allow-Origin","http://localhost:4200");
		
		PnrStatus pnrstatus=new PnrStatus();
		pnrstatus.setPnrNo(pnrNo);
		pnrstatus.setTrainNo(125342);
		pnrstatus.setTrvelDate(LocalDate.of(2020, 2, 10));
		
		List<Passenger> pass=new ArrayList<Passenger>();
		
		Passenger passenger=new Passenger();
		passenger.setName("sahil");
		passenger.setGender(Gender.MALE);
		passenger.setAge(25);
		passenger.setStatus(Status.CONFIRMED);
		pass.add(passenger);
		
		passenger=new Passenger();
		passenger.setName("Chinmay");
		passenger.setGender(Gender.MALE);
		passenger.setAge(22);
		passenger.setStatus(Status.CONFIRMED);
		pass.add(passenger);
		
		passenger=new Passenger();
		passenger.setName("Ram");
		passenger.setGender(Gender.MALE);
		passenger.setAge(60);
		passenger.setStatus(Status.WAITING);
		pass.add(passenger);
		
		passenger=new Passenger();
		passenger.setName("Sita");
		passenger.setGender(Gender.FEMALE);
		passenger.setAge(90);
		passenger.setStatus(Status.RAC);
		pass.add(passenger);
		
		passenger=new Passenger();	
		passenger.setName("Gita");
		passenger.setGender(Gender.OTHERS);
		passenger.setAge(25);
		passenger.setStatus(Status.CONFIRMED);
		pass.add(passenger);
		
		pnrstatus.setPassengers(pass);
		
		return pnrstatus;
	}
}
