package br.com.eric.crm.util;

import java.io.File;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

/* 
 * PdfMake - É uma classe voltada para a configuração rapida
 * de arquivos em pdf.
 * Da as configurações basicas de forma rapida e com menor
 * quantidade de codigo escrito em sua classe principal.
 * 
 * criada e editada por Eric Bezerra
 * email ericshussan@hotmail.com
 * */

public class PdfMake {

	// Configura tamanho de imagem passando os paramentros
	// sizePercent = Sendo o tamanho total da imagem em porcentagem em relação a
	// pagina
	// identation = recuo referente a margem lateral padrão é zero
	// doc = documento a ser adicionado
	// img = imagem a ser editada
	public static float imageSize(int sizePercent, int identation, Document doc, Image img) {
		return ((doc.getPageSize().getWidth() - doc.leftMargin() - doc.rightMargin() - identation) / img.getWidth())
				* sizePercent;
	}

	// Configura de forma rapida um tabela passando os parametros
	// columnSize = tamanho das colunas
	// SpaceingBefore = espaco apos a construcao da tabela
	// WidthPercentage = tamanho total da tabela em relação a pagina
	public static PdfPTable makeTable(float[] columnSize, float SpaceingBefore, float WidthPercentage) {
		PdfPTable table = new PdfPTable(columnSize);
		table.setSpacingBefore(SpaceingBefore);
		table.setWidthPercentage(WidthPercentage);

		return table;
	}

	// Configura rapidamente uma celula e insere na tabela dada pelos parametros
	// table = tabela a ser inserida celulas
	// text = texto interno da celula
	// align = alinhamento do texto da celula
	// border = tipo de borda da celula
	public static void insertCell(PdfPTable table, String text, int align, int border, Font font) {
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		cell.setBorder(border);
		cell.setHorizontalAlignment(align);
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		table.addCell(cell);
	}

	// Configura rapidamente uma celula e insere na tabela dada pelos parametros
	// table = tabela a ser inserida celulas
	// text = texto interno da celula
	// align = alinhamento do texto da celula
	// border = tipo de borda da celula
	// color = cor de fundo da celula
	public static void insertCell(PdfPTable table, String text, int align, int border, BaseColor color, Font font) {
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		cell.setBorder(border);
		cell.setBackgroundColor(color);
		cell.setHorizontalAlignment(align);
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		table.addCell(cell);
	}
	
	//Inclui de forma rapida colunas em branco na proxima linha da tabela estabelecendo um espaco
	public static void tableSpace(PdfPTable table){
		for(int i = 0; i < 6; i++)PdfMake.insertCell(table, "", Element.ALIGN_CENTER, Rectangle.NO_BORDER, null);
	}
	
	//Usado para testes abre o arquivo pdf assim que finalizado
	public static void openPdf(String name, int open){
		if (open == 0) {
			java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
			try {
				desktop.open(new File(name));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
