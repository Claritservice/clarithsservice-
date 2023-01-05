package com.clarit.hs.service.items;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by mnachiappan on 1/4/23.
 */

public interface IProperty {

	public List<Room> getAll(boolean occupied) ;
    public Room book(int roomNumber) ;
    public Room get(int roomNumber) ;
    public void cancelBooking(int roomNumber) ;
}
