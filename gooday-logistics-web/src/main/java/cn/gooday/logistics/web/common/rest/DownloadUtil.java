package cn.gooday.logistics.web.common.rest;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DownloadUtil {

	/**
	 * @param filePath
	 *            要下载的文件路径
	 * @param returnName
	 *            返回的文件名
	 * @param response
	 *            HttpServletResponse
	 * @param delFlag
	 *            是否删除文件
	 */
	protected void download(String filePath, String returnName,
			HttpServletResponse response, boolean delFlag) {
		this.prototypeDownload(new File(filePath), returnName, response,
				delFlag);
	}

	/**
	 * @param file
	 *            要下载的文件
	 * @param returnName
	 *            返回的文件名
	 * @param response
	 *            HttpServletResponse
	 * @param delFlag
	 *            是否删除文件
	 */
	protected void download(File file, String returnName,
			HttpServletResponse response, boolean delFlag) {
		this.prototypeDownload(file, returnName, response, delFlag);
	}

	/**
	 * @param file
	 *            要下载的文件
	 * @param returnName
	 *            返回的文件名
	 * @param response
	 *            HttpServletResponse
	 * @param delFlag
	 *            是否删除文件
	 */
	public void prototypeDownload(File file, String returnName,
			HttpServletResponse response, boolean delFlag) {
		FileInputStream inputStream = null;
		ServletOutputStream outputStream = null;
		try {
			if (!file.exists())
				return;
			response.reset();
			response.setContentType("application/octet-stream;charset=utf-8");
			returnName = response.encodeURL(new String(returnName.getBytes(),
					"iso8859-1")); // 保存的文件名,必须和页面编码一�?否则乱码
			response.addHeader("Content-Disposition", "attachment;filename="
					+ returnName);
			inputStream = new FileInputStream(file);
			outputStream = response.getOutputStream();
			int length = 1024;
			int readLength = 0;
			byte buf[] = new byte[1024];
			readLength = inputStream.read(buf, 0, length);
			while (readLength != -1) {
				outputStream.write(buf, 0, readLength);
				readLength = inputStream.read(buf, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.flush();
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (delFlag) {
				file.delete();
			}
		}
	}

	/**
	 * 
	 * @param byteArrayOutputStream
	 *            将文件内容写入ByteArrayOutputStream
	 * @param response
	 *            HttpServletResponse 写入response
	 * @param returnName
	 *            返回的文件名
	 */
	public void download(ByteArrayOutputStream byteArrayOutputStream,
			HttpServletResponse response, String returnName) throws IOException {
		response.setContentType("application/octet-stream;charset=utf-8");
		returnName = response.encodeURL(new String(returnName.getBytes(),
				"iso8859-1")); // 保存的文件名,必须和页面编码一�?否则乱码
		response.addHeader("Content-Disposition", "attachment;filename="
				+ returnName);
		response.setContentLength(byteArrayOutputStream.size());

		ServletOutputStream outputstream = response.getOutputStream(); // 取得输出�?
		byteArrayOutputStream.writeTo(outputstream); // 写到输出�?
		byteArrayOutputStream.close(); // 关闭
		outputstream.flush(); // 刷数�?
	}
}
