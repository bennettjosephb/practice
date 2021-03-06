package au.com.showcase.application.captcha;

import static nl.captcha.Captcha.NAME;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nl.captcha.Captcha;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.gimpy.DropShadowGimpyRenderer;
import nl.captcha.servlet.CaptchaServletUtil;
import nl.captcha.servlet.SimpleCaptchaServlet;
import nl.captcha.text.producer.DefaultTextProducer;

public class ExtendedCaptchaServlet extends SimpleCaptchaServlet {

	private static final long serialVersionUID = 6560171562324177699L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession session = req.getSession();

		System.out.println("ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD ");

		// TextProducer textProducer = new TextProducer() {
		//
		// public String getText() {
		//
		// return "Hai";
		// }
		// };

//		BackgroundProducer backgroundProducer = new BackgroundProducer() {
//
//			public BufferedImage getBackground(int arg0, int arg1) {
//				return null;
//			}
//
//			public BufferedImage addBackground(BufferedImage arg0) {
//				return null;
//			}
//		};

		Captcha captcha = new Captcha.Builder(_width, _height)
				.addText(new DefaultTextProducer(9))
				.addBackground(new GradiatedBackgroundProducer())
				.gimp(new DropShadowGimpyRenderer()).addNoise().addBorder()
				.build();

		session.setAttribute(NAME, captcha);

		System.out.println("ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD ");
		
		CaptchaServletUtil.writeImage(resp, captcha.getImage());

	}
}
