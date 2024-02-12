package com.ffmpeg.ffmpeg;

import java.io.*;

import org.springframework.http.ResponseEntity;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;
import ws.schild.jave.VideoAttributes;
import ws.schild.jave.VideoAttributes.X264_PROFILE;
import ws.schild.jave.VideoSize;


public class Execution {
	public void execution() throws IOException{
		/* Step 1. Declaring source file and Target file */
		File source = new File("Source2.mp4");
		File target = new File("target3.mp3");

		/* Step 2. Set Audio Attrributes for conversion*/
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("aac");
		// here 64kbit/s is 64000
		audio.setBitRate(64000);
		audio.setChannels(2);
		audio.setSamplingRate(44100);

		/* Step 3. Set Video Attributes for conversion*/
		VideoAttributes video = new VideoAttributes();
		video.setCodec("h264");
		video.setX264Profile(X264_PROFILE.BASELINE);
		// Here 160 kbps video is 160000
		video.setBitRate(160000);
		// More the frames more quality and size, but keep it low based on devices like mobile
		video.setFrameRate(15);
		video.setSize(new VideoSize(400, 300));

		/* Step 4. Set Encoding Attributes*/
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp4");
		attrs.setAudioAttributes(audio);
		attrs.setVideoAttributes(video);

		/* Step 5. Do the Encoding*/
		try {
			Encoder encoder = new Encoder(); //1
			// second line is not work
			// so i replace it to encoder.encode(, target, attrs)
			encoder.encode(new MultimediaObject(source), target, attrs); //2
			} catch (Exception e) {
			/*Handle here the video failure*/
			e.printStackTrace();
			}}
	
}
//import necessary libraries
