package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (5)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        DBaccess dBaccess = new DBaccess("figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();

        PuntDAO puntDAO = new PuntDAO(dBaccess);
        puntDAO.slaPuntOp(new Punt(8, -12));

        ArrayList<Punt> puntenInDeDatabase = puntDAO.getPunten();
        for (Punt punt : puntenInDeDatabase) {
            System.out.println(punt);
        }

        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);
        cirkelDAO.slaCirkelOp(new Cirkel(6.5, new Punt(-2.3,-1.3),"paars"));

        dBaccess.closeConnection();

    }

}
