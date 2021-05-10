package com.example.bootreview.service;

import com.example.bootreview.entity.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Castle
 * @Date 2021/5/10 9:21
 */
@Service
public class ResponseToXlsConverter extends AbstractHttpMessageConverter<Student> {

    private static final MediaType EXCEL_TYPE = MediaType.valueOf("application/vnd.ms-excel");

    public ResponseToXlsConverter() {
        super(EXCEL_TYPE);
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return aClass == Student.class;
    }

    @Override
    protected Student readInternal(Class<? extends Student> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(Student student, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        final Workbook workbook = new HSSFWorkbook();
        final Sheet sheet = workbook.createSheet();
        final Row row = sheet.createRow(0);
        row.createCell(0).setCellValue(student.getId());
        row.createCell(1).setCellValue(student.getName());
        workbook.write(httpOutputMessage.getBody());
    }
}
