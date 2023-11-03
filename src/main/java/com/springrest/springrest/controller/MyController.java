package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController

public class MyController {
	
	@Autowired  // create automatic object
	private LoadService loadService;
	
	
	
	
	//get the courses

	 @GetMapping("/load")
	public List<Load> getLoads(){
		
		return this.loadService.getLoad();
		
	}
	 
	 // to return single course we create method for get course id
	 
	 @GetMapping("/load/{shipperId}")
	 public Load getLoad(@PathVariable Long shipperId) {
		 
	 return this.loadService.getLoad(shipperId);
	 }
	 
//	 @PostMapping("/load" )
//	 public Load addLoad(@RequestBody Load load) {
//		 
//		 return this.loadService.addLoad(load);
//	 }
	 @PostMapping("/load")
	 public ResponseEntity<String> addLoad(@RequestBody Load load) {
	     try {
	         Load savedLoad = this.loadService.addLoad(load);
	         return new ResponseEntity<>("Load added successfully with shipper_id: " + savedLoad.getShipperId(), HttpStatus.CREATED);
	     } catch (DataIntegrityViolationException e) {
	         // Handle the unique constraint violation error
	         return new ResponseEntity<>("Error: Duplicate shipper_id. Please provide a unique shipper_id.", HttpStatus.BAD_REQUEST);
	     } catch (Exception e) {
	         // Handle other exceptions
	         return new ResponseEntity<>("An error occurred while processing the request.", HttpStatus.INTERNAL_SERVER_ERROR);
	     }
	 }
	 
	 @PutMapping("/load/{shipperId}")
	 
	 public Load  updateLoad(@PathVariable Long shipperId ,@RequestBody Load load) {
		return this.loadService.updateLoad(shipperId, load);
		
		 
	 }
	 
	 @DeleteMapping("/load/{shipperId}") 
	 public ResponseEntity<HttpStatus> deleteload(@PathVariable Long shipperId) {
		 try {
			 this.loadService.deleteload(shipperId);
			 return new ResponseEntity<>(HttpStatus.OK);
		 }catch(Exception e){
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
	 }
	 

}




















