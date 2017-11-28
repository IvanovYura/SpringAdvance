<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div id="header">
            <p class="display-4 text-primary">Available Auditoriums</p>
        </div>
        <div id="content">
            <table class="table table-dark table-hover">
                <tr>
                    <th>Name</th>
                    <th>Numbers of Seats</th>
                </tr>
                <#list auditoriums as auditorium>
                <tr>
                    <td>${auditorium.name}</td>
                    <td>${auditorium.numberOfSeats}</td>
                </tr>
                </#list>
            </table>
        </div>
    </body>
</html>