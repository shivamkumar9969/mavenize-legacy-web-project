package com.github.pietroaragona.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.maven.model.Model;

import com.github.pietroaragona.Mavenize;

public class PropertyHelper {

	public static void run(Model model, String webContentDir, String projectName, String finalName) {
//		Scanner sc = new Scanner(System.in);
		
        model.addProperty("project.build.sourceEncoding", "UTF-8");
        model.addProperty("maven.war.plugin.version", "2.4");
        model.addProperty("maven.compiler.plugin.version", "3.1");
        model.addProperty("java.source.version", "1.6");
        model.addProperty("java.target.version", "1.6");
        model.addProperty("src.dir", "src");
        model.addProperty("war.source.dir", webContentDir);
        model.addProperty("final.name", finalName);
        model.addProperty("legacy.lib.version", "1.0-legacy");
        model.addProperty("legacy.lib.scope", "system");
        System.out.println();
        
//		sc.close();
		
	}

}
