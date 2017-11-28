package ru.epam.spring.hometask.common.view;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import ru.epam.spring.hometask.domain.Ticket;

public class PDFTicketsView extends AbstractPdfView{

    @Override
    protected void buildPdfDocument(Map model, Document document,
                                    PdfWriter writer, HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        List<Ticket> tickets = (List<Ticket>) model.get("tickets");

        Table table = new Table(6);
        table.addCell("User");
        table.addCell("Movie");
        table.addCell("Price");
        table.addCell("Date");
        table.addCell("Hall");
        table.addCell("Seat");

        for (Ticket ticket : tickets) {
            table.addCell(ticket.getUser().getFirstName());
            table.addCell(ticket.getEvent().getName());
            table.addCell(String.valueOf(ticket.getEvent().getBasePrice()));
            table.addCell(String.valueOf(ticket.getDateTime()));
            table.addCell(String.valueOf(ticket.getAuditorium().getName()));
            table.addCell(String.valueOf(ticket.getSeat()));
        }

        document.add(table);
    }
}
