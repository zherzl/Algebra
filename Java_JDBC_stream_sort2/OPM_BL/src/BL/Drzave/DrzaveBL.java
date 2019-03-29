package BL.Drzave;

import BL.Messaging.GET.*;
import BL.Messaging.UPDATE.*;
import DAL.Factory.*;
import DAL.Interfaces.*;
import Model.Drzava;
import java.util.*;
import java.util.stream.*;

public class DrzaveBL {

    IDrzaveRepo repo;

    public DrzaveBL() {
        repo = RepoFactory.getDrzaveRepo();
    }

    public GetDrzaveResponse GetDrzave(GetDrzaveRequest request) {
        GetDrzaveResponse response = new GetDrzaveResponse();

        try {
            response.drzave = repo.getDrzave();
//            response.drzave.stream()
//                    .sorted(Comparator.comparing(Drzava::getId).reversed())
//                    .collect(Collectors.toList());

// ILI
            response.drzave = response.drzave.stream()
                    .sorted((x1, x2) -> Long.compare(x2.getId(), x1.getId()))
                    .limit(10)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setSuccess(false);
        }

        return response;
    }

    public InsertDrzavaResponse insertDrzava(InsertDrzavaRequest request) {
        InsertDrzavaResponse response = new InsertDrzavaResponse();

        try {
            repo.insertNovaDrzava(request.naziv);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setSuccess(false);
        }

        return response;
    }

}
