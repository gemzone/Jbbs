package com.modjk.api.naver.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modjk.api.naver.NaverContextManager;

@WebServlet("/api/NaverProcess")
public class NaverProcessController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public String generateState()
	{
	    SecureRandom random = new SecureRandom();
	    return new BigInteger(130, random).toString(32);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NaverProcessController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// text/html
		// application/json
		// text/xml
		// text/plain
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		// 상태 토큰으로 사용할 랜덤 문자열 생성
		String state = generateState();
		// 세션 또는 별도의 저장 공간에 상태 토큰을 저장
		request.getSession().setAttribute( NaverContextManager.naverStateSessionName, state);
		
		
		
		out.println( "session: " + request.getSession().getAttribute( NaverContextManager.naverStateSessionName) );
//		useSession();
//		outText();
//		NAVERInfo nic;
//		String type = getParameter("type");
//		
//		
//		// == 접속시도 ===============================================================================
//		if ("signIn".equals(type)) 
//		{
//			// 이미 접속중
//			if (isSignIn())
//			{
//				out.print('0');
//			}
//			else if
//			(
//				(
//					nic = ("1".equals(getParameter("cache")) ? NAVERUtil.getCacheNAVERInfo(this) : NAVERUtil.getAuthNAVERInfo(this))
//				) != null
//			)
//			{
//				// 로그인 성공
//				if (AcAuth.doneDirSingIn(AcAuth.authXlink(nic.getId(), "NAVER", getIP(), "1".equals(getParameter("auto"))), this) > 0)
//				{
//					NAVERUtil.delCacheNAVERInfo(this);
//					out.print('1');
//				}
//				// 계정을 새로 생성해야함.
//				else
//				{
//					if (getSQL("SELECT vd_mail_dup(?)").set(1, nic.getEmail()).fnBoolean(true))
//					{
//						out.print("11");
//					}
//					else if (getSQL("SELECT vd_mail_ban(?)").set(1, nic.getEmail()).fnBoolean(true))
//					{
//						out.print("13");
//					}
//					else
//					{
//						out.print('2');
//					}
//				}
//			}
//			else
//			{
//				out.print("-2");
//			}
//		}
//		// == 계정생성 ===============================================================================
//		else if ("create".equals(type))
//		{
//			String bd = getParameter("bd");
//			// 이미 접속중
//			if (isSignIn())
//			{
//				out.print('0');
//			}
//			else if ((nic = NAVERUtil.getCacheNAVERInfo(this)) != null && Texts.isDate(bd, SDF_SARO))
//			{
//				String cy = getSQL("SELECT cy_get(?::inet)").set(1, getIP()).fnString(null);
//				if (cy == null) // 기본국가 한국
//				{
//					cy = "KR";
//				}
//				long res = getSQL("SELECT ac_create_xlink(?,?,?,?,?::date,?,?::inet)").set(1, "NAVER").set(2, nic.getEmail()).set(3, nic.getId()).set(4, cy).set(5, bd).set(6, getLang()).set(7, getIP()).fnLong(-1);
//				if (res > 0L)
//				{
//					out.print("10");
//				}
//				else
//				{
//					// 실패
//					out.print(res == -1L ? res : (res * -1));
//				}
//			}
//			else
//			{
//				out.print("-1");
//			}
//		}
//		// == 세션 재인증 ===============================================================================
//		else if ("seAuth".equals(type)) 
//		{
//			if (isSignIn() && (nic = NAVERUtil.getAuthNAVERInfo(this)) != null)
//			{
//				if (getSQL("SELECT ac_auth_xlink(?, ?, ?, ?::inet)").set(1, getSn()).set(2, "NAVER").set(3, nic.getId()).set(4, getIP()).fnBoolean(false))
//				{
//					Valid.confirmSessionValid(this);
//					out.print("20");
//				}
//				else
//				{
//					out.print("21");
//				}
//			}
//			else
//			{
//				out.print("-1");
//			}
//		}
//		// == 계정 추가 ===============================================================================
//		else if ("add".equals(type)) 
//		{
//			if (Valid.isSeValid(this) && (nic = NAVERUtil.getAuthNAVERInfo(this)) != null)
//			{
//				if (getSQL("SELECT ac_change_xlink(?, ?, ?::text, ?::inet)").set(1, getSn()).set(2, "NAVER").set(3, nic.getId()).set(4, getIP()).fnBoolean(false))
//				{
//					out.print("30");
//				}
//				else
//				{
//					out.print("31");
//				}
//			}
//			else
//			{
//				out.print(-1);
//			}
//		}
//		else if ("del".equals(type)) 
//		{
//			if (Valid.isSeValid(this) && getSQL("SELECT ac_change_xlink(?, ?, ?::text, ?::inet)").set(1, getSn()).set(2, "NAVER").set(3, null).set(4, getIP()).fnBoolean(false))
//			{
//				out.print("40");
//			}
//			else
//			{
//				out.println(-1);
//			}
//		}
//		// == 잘못된 접근 ===============================================================================
//		else
//		{
//			out.print("-1");
//		}
	
		
	}

}
