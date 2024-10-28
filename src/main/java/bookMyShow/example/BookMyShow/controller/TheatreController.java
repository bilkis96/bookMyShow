package bookMyShow.example.BookMyShow.controller;

import bookMyShow.example.BookMyShow.enums.SeatType;
import bookMyShow.example.BookMyShow.models.City;
import bookMyShow.example.BookMyShow.models.Hall;
import bookMyShow.example.BookMyShow.models.Theatre;
import bookMyShow.example.BookMyShow.service.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class TheatreController {

    final private TheatreService theatreService;
//create
    public String createCity(@NonNull final String cityName)
    {
        String cityId = theatreService.createCity(cityName).getCityId();
        return cityId;
    }

    public String createTheatre(@NonNull String theatreName, @NonNull String cityId)
    {
        City city = theatreService.getCityFromId(cityId);
        String theatreId = theatreService.createTheatre(theatreName, city).getTheatreId();
        return theatreId;
    }

    public String createHall(@NonNull final String hallName, @NonNull final String theatreId)
    {
        Theatre theatre = theatreService.getTheatreById(theatreId);
        String hallId = theatreService.createHall(hallName,theatre).getHallId();
        return hallId;
    }

    public String createSeat(@NonNull final SeatType seatType, @NonNull final String hallId, @NonNull final String seatName)
    {
        Hall hall = theatreService.getHallById(hallId);
        String seatId = theatreService.createSeat(seatType, hall, seatName).getSeatId();
        return seatId;
    }

    //getData

    public List<City> getCities()
    {
        return theatreService.getAllCities();
    }

    public City getCity(@NonNull final String cityId)
    {
        return theatreService.getCityFromId(cityId);
    }



}
