package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation reservation);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
