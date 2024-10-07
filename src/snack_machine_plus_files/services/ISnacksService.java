package snack_machine_plus_files.services;

import snack_machine_plus_files.domain.Snack;

import java.util.List;

public interface ISnacksService {

    void addSnack(Snack snack);
    void showSnacks();
    List<Snack> getSnacks();

}
