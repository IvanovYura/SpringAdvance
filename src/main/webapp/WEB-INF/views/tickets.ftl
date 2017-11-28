<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div id="header">
            <p class="display-4 text-primary">Tickets</p>
        </div>
        <div id="content">
            <table class="table table-dark table-hover">
                <#list tickets as ticket>
                <tr>
                    <th>User</th>
                    <th>Movie</th>
                    <th>Price</th>
                    <th>Date</th>
                    <th>Hall</th>
                    <th>Seat</th>
                </tr>
                <tr>
                    <td>${ticket.user.firstName}</td>
                    <td>${ticket.event.name}</td>
                    <td>${ticket.event.basePrice}</td>
                    <td>${ticket.dateTime}</td>
                    <td>${ticket.auditorium.name}</td>
                    <td>${ticket.seat}</td>
                </tr>
                </#list>
            </table>
            <p class="display-6 text-primary">Ticket Price</p>
            <form name="user" action="/ticket/getByNameAndDate">
                <div class="form-group">
                    <label for="email">Event Name</label>
                    <input class="form-control" name="eventName" />
                    <label for="email">Date</label>
                    <input class="form-control" name="dateTime" />
                    <input class="btn btn-primary" type="submit" value="Go" />
                </div>
            </form>
            </br>
            <a href="/tickets/pdf" class="btn btn-secondary">Export PDF</a>
        </div>
    </body>
</html>