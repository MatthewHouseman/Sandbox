package edu.ucsc.common_utils;

public class FileHandler
{
	public String normalizeFilename ( String filename )
	{
		String normalizedFilename = filename.replaceAll("[^.a-zA-Z0-9]", "_");

		return ( normalizedFilename );
	}
}
