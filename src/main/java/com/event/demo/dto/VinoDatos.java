package com.event.demo.dto;

import java.util.Base64;

public interface VinoDatos {

		int getId();
		String getUva();
		String getColorUva();
		String getDescripcionUva();
		String getClasificacion();
		String getColor();
		int getTiempo_barrica();
		int getTiempo_botella();
		int getTiempo_total();
		String getNombreVino();
		String getBodega();
		String getRegion();
		int getAnno();
		String getImg();
		String getSabor();
		String getVariedad();

		default String getImgBase64() {
	        String img = getImg();
	        if (img != null && !img.isEmpty()) {
	            byte[] imgBytes = img.getBytes();
	            return Base64.getEncoder().encodeToString(imgBytes);
	        }
	        return null;
	    }

}
