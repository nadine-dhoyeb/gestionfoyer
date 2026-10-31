package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc bloc);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
}
