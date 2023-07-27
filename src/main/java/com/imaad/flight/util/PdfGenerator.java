package com.imaad.flight.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.fasterxml.classmate.GenericType;
import com.imaad.flight.enitity.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfGenerator {
	public void GenerateItinerary(Reservation  reservation , String filePath) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(genrateTable(reservation));
			document.close();    
			
			
		} catch (FileNotFoundException | DocumentException e) {
			System.out.println("an exception has occure ");
			System.out.println(e.getStackTrace());
		}
		
	}
	private PdfPTable genrateTable(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("flight Itineray"));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("flight details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("airlines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		
		table.addCell("departure city");
		table.addCell(reservation.getFlight().getDeparture());
		
		table.addCell("arrival city");
		table.addCell(reservation.getFlight().getArrivalcity());
		
		table.addCell("flight number");
		table.addCell(reservation.getFlight().getFlightNumber());
		
		table.addCell("departure Date");
		table.addCell(reservation.getFlight().getDateofDeparture());
		
		table.addCell("departure time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime());
		
		cell = new PdfPCell(new Phrase("passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("first name");
		table.addCell(reservation.getPassenger().getFirstName());
		
		table.addCell("middle name");
		table.addCell(reservation.getPassenger().getMiddleName());
		
		table.addCell("last name");
		table.addCell(reservation.getPassenger().getLastName());
		
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("phone");
		table.addCell(reservation.getPassenger().getPhone());
		return table;
		
	}

}
