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

        DBaccess dBaccess = new DBaccess("figuren", "userFiguren","userFigurenPW");
        dBaccess.openConnection();
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);
        cirkelDAO.slaCirkelOp(new Cirkel(5, new Punt(3, 7), "oranje"));
        dBaccess.closeConnection();

    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}
