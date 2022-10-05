package com.geektrust.backend;

import com.geektrust.backend.commands.CommandInvoker;
import com.geektrust.backend.config.ApplicationConfig;
import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.exceptions.NoSuchCommandException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> commandLineArguments = new LinkedList<>(Arrays.asList(args));
		run(commandLineArguments);
	}
	public static void run(List<String> commandLineArgs) {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		CommandInvoker commandInvoker = applicationConfig.getCommandInvoker();
		BufferedReader bufferedReader;
		String inputFileName = commandLineArgs.get(Constants.ZERO);
		try {
			bufferedReader = new BufferedReader(new FileReader(inputFileName));
			String line = bufferedReader.readLine();
			while (line != null) {
				List<String> listOfTokens = Arrays.asList(line.split(" "));
				commandInvoker.executeCommand(listOfTokens.get(Constants.ZERO), listOfTokens);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
