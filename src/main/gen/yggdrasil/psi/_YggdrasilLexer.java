// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: yggdrasil.flex

package yggdrasil.psi;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static yggdrasil.psi.YggdrasilTypes.*;


public class _YggdrasilLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\2\u1f00\1\u2200\1\u2300"+
    "\2\u1f00\31\u0100\1\u2400\121\u0100\1\u2500\4\u0100\1\u2600\1\u0100"+
    "\1\u2700\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\53\u0100\1\u2d00"+
    "\10\u2e00\31\u1f00\1\u0100\1\u2f00\1\u3000\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00\1\u0100"+
    "\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u1f00"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000"+
    "\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00\4\u0100\1\u5400"+
    "\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600\1\u5700\2\u1f00"+
    "\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00\45\u1f00\1\u0100"+
    "\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00\1\u6000\1\u1f00"+
    "\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500\5\u1f00\1\u6600"+
    "\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00\1\u6b00\21\u1f00"+
    "\246\u0100\1\u6c00\20\u0100\1\u6d00\1\u6e00\25\u0100\1\u6f00\34\u0100"+
    "\1\u7000\14\u1f00\2\u0100\1\u7100\u0b06\u1f00\1\u7200\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\5\1\6\2\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\12\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\32\30\1\31\1\32"+
    "\1\33\1\34\1\30\1\35\1\36\1\37\1\40\1\30"+
    "\1\41\1\42\1\43\1\30\1\44\1\30\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\30\1\53\1\54\1\55"+
    "\1\56\3\30\1\57\1\30\1\60\1\61\1\62\1\63"+
    "\6\0\1\3\32\0\1\1\11\0\1\30\12\0\1\30"+
    "\1\0\1\64\2\0\1\30\5\0\27\30\1\0\37\30"+
    "\1\0\u01ca\30\4\0\14\30\16\0\5\30\7\0\1\30"+
    "\1\0\1\30\21\0\160\64\5\30\1\0\2\30\3\0"+
    "\3\30\1\0\1\30\6\0\1\30\1\64\3\30\1\0"+
    "\1\30\1\0\24\30\1\0\123\30\1\0\213\30\1\0"+
    "\5\64\2\0\246\30\1\0\46\30\2\0\1\30\6\0"+
    "\51\30\10\0\55\64\1\0\1\64\1\0\2\64\1\0"+
    "\2\64\1\0\1\64\10\0\33\30\4\0\4\30\35\0"+
    "\13\64\5\0\53\30\37\64\4\0\2\30\1\64\143\30"+
    "\1\0\1\30\7\64\2\0\6\64\2\30\2\64\1\0"+
    "\4\64\2\30\12\64\3\30\2\0\1\30\20\0\1\30"+
    "\1\64\36\30\33\64\2\0\131\30\13\64\1\30\16\0"+
    "\12\64\41\30\11\64\2\30\4\0\1\30\2\0\1\64"+
    "\2\0\26\30\4\64\1\30\11\64\1\30\3\64\1\30"+
    "\5\64\22\0\31\30\3\64\4\0\13\30\65\0\25\30"+
    "\1\0\10\30\25\0\17\64\1\0\41\64\66\30\3\64"+
    "\1\30\22\64\1\30\7\64\12\30\2\64\2\0\12\64"+
    "\1\0\20\30\3\64\1\0\10\30\2\0\2\30\2\0"+
    "\26\30\1\0\7\30\1\0\1\30\3\0\4\30\2\0"+
    "\1\64\1\30\7\64\2\0\2\64\2\0\3\64\1\30"+
    "\10\0\1\64\4\0\2\30\1\0\3\30\2\64\2\0"+
    "\12\64\2\30\12\0\1\30\1\0\1\64\2\0\3\64"+
    "\1\0\6\30\4\0\2\30\2\0\26\30\1\0\7\30"+
    "\1\0\2\30\1\0\2\30\1\0\2\30\2\0\1\64"+
    "\1\0\5\64\4\0\2\64\2\0\3\64\3\0\1\64"+
    "\7\0\4\30\1\0\1\30\7\0\14\64\3\30\1\64"+
    "\13\0\3\64\1\0\11\30\1\0\3\30\1\0\26\30"+
    "\1\0\7\30\1\0\2\30\1\0\5\30\2\0\1\64"+
    "\1\30\10\64\1\0\3\64\1\0\3\64\2\0\1\30"+
    "\17\0\2\30\2\64\2\0\12\64\11\0\1\30\6\64"+
    "\1\0\3\64\1\0\10\30\2\0\2\30\2\0\26\30"+
    "\1\0\7\30\1\0\2\30\1\0\5\30\2\0\1\64"+
    "\1\30\7\64\2\0\2\64\2\0\3\64\10\0\2\64"+
    "\4\0\2\30\1\0\3\30\2\64\2\0\12\64\1\0"+
    "\1\30\20\0\1\64\1\30\1\0\6\30\3\0\3\30"+
    "\1\0\4\30\3\0\2\30\1\0\1\30\1\0\2\30"+
    "\3\0\2\30\3\0\3\30\3\0\14\30\4\0\5\64"+
    "\3\0\3\64\1\0\4\64\2\0\1\30\6\0\1\64"+
    "\16\0\12\64\20\0\5\64\10\30\1\0\3\30\1\0"+
    "\27\30\1\0\20\30\3\0\1\30\7\64\1\0\3\64"+
    "\1\0\4\64\7\0\2\64\1\0\3\30\5\0\2\30"+
    "\2\64\2\0\12\64\20\0\1\30\3\64\1\0\10\30"+
    "\1\0\3\30\1\0\27\30\1\0\12\30\1\0\5\30"+
    "\2\0\1\64\1\30\7\64\1\0\3\64\1\0\4\64"+
    "\7\0\2\64\7\0\1\30\1\0\2\30\2\64\2\0"+
    "\12\64\1\0\2\30\15\0\4\64\1\0\10\30\1\0"+
    "\3\30\1\0\51\30\2\64\1\30\7\64\1\0\3\64"+
    "\1\0\4\64\1\30\5\0\3\30\1\64\7\0\3\30"+
    "\2\64\2\0\12\64\12\0\6\30\2\0\2\64\1\0"+
    "\22\30\3\0\30\30\1\0\11\30\1\0\1\30\2\0"+
    "\7\30\3\0\1\64\4\0\6\64\1\0\1\64\1\0"+
    "\10\64\6\0\12\64\2\0\2\64\15\0\60\30\1\64"+
    "\1\30\10\64\5\0\7\30\10\64\1\0\12\64\47\0"+
    "\2\30\1\0\1\30\1\0\5\30\1\0\30\30\1\0"+
    "\1\30\1\0\12\30\1\64\1\30\12\64\1\30\2\0"+
    "\5\30\1\0\1\30\1\0\6\64\2\0\12\64\2\0"+
    "\4\30\40\0\1\30\27\0\2\64\6\0\12\64\13\0"+
    "\1\64\1\0\1\64\1\0\1\64\4\0\2\64\10\30"+
    "\1\0\44\30\4\0\24\64\1\0\2\64\5\30\13\64"+
    "\1\0\44\64\11\0\1\64\71\0\53\30\24\64\1\30"+
    "\12\64\6\0\6\30\4\64\4\30\3\64\1\30\3\64"+
    "\2\30\7\64\3\30\4\64\15\30\14\64\1\30\17\64"+
    "\2\0\46\30\1\0\1\30\5\0\1\30\2\0\53\30"+
    "\1\0\115\30\1\0\4\30\2\0\7\30\1\0\1\30"+
    "\1\0\4\30\2\0\51\30\1\0\4\30\2\0\41\30"+
    "\1\0\4\30\2\0\7\30\1\0\1\30\1\0\4\30"+
    "\2\0\17\30\1\0\71\30\1\0\4\30\2\0\103\30"+
    "\2\0\3\64\11\0\11\64\16\0\20\30\20\0\126\30"+
    "\2\0\6\30\3\0\u016c\30\2\0\21\30\1\1\32\30"+
    "\5\0\113\30\3\0\13\30\7\0\15\30\1\0\4\30"+
    "\3\64\13\0\22\30\3\64\13\0\22\30\2\64\14\0"+
    "\15\30\1\0\3\30\1\0\2\64\14\0\64\30\40\64"+
    "\3\0\1\30\4\0\1\30\1\64\2\0\12\64\41\0"+
    "\3\64\2\0\12\64\6\0\131\30\7\0\51\30\1\64"+
    "\1\30\5\0\106\30\12\0\37\30\1\0\14\64\4\0"+
    "\14\64\12\0\12\64\36\30\2\0\5\30\13\0\54\30"+
    "\4\0\32\30\6\0\13\64\45\0\27\30\5\64\4\0"+
    "\65\30\12\64\1\0\35\64\2\0\13\64\6\0\12\64"+
    "\15\0\1\30\10\0\16\64\102\0\5\64\57\30\21\64"+
    "\7\30\4\0\12\64\21\0\11\64\14\0\3\64\36\30"+
    "\15\64\2\30\12\64\54\30\16\64\14\0\44\30\24\64"+
    "\10\0\12\64\3\0\3\30\12\64\44\30\2\0\11\30"+
    "\7\0\53\30\2\0\3\30\20\0\3\64\1\0\25\64"+
    "\4\30\1\64\6\30\1\64\2\30\3\64\1\30\5\0"+
    "\300\30\72\64\1\0\5\64\26\30\2\0\6\30\2\0"+
    "\46\30\2\0\6\30\2\0\10\30\1\0\1\30\1\0"+
    "\1\30\1\0\1\30\1\0\37\30\2\0\65\30\1\0"+
    "\7\30\1\0\1\30\3\0\3\30\1\0\7\30\3\0"+
    "\4\30\2\0\6\30\4\0\15\30\5\0\3\30\1\0"+
    "\7\30\3\0\13\1\35\0\2\3\5\0\1\1\17\0"+
    "\2\64\23\0\1\64\12\0\1\1\21\0\1\30\15\0"+
    "\1\30\20\0\15\30\63\0\15\64\4\0\1\64\3\0"+
    "\14\64\21\0\1\30\4\0\1\30\2\0\12\30\1\0"+
    "\1\30\2\0\6\30\6\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\20\30\2\0\4\30\5\0\5\30\4\0"+
    "\1\30\21\0\51\30\u0177\0\57\30\1\0\57\30\1\0"+
    "\205\30\6\0\4\30\3\64\2\30\14\0\46\30\1\0"+
    "\1\30\5\0\1\30\2\0\70\30\7\0\1\30\17\0"+
    "\1\64\27\30\11\0\7\30\1\0\7\30\1\0\7\30"+
    "\1\0\7\30\1\0\7\30\1\0\7\30\1\0\7\30"+
    "\1\0\7\30\1\0\40\64\1\1\4\0\3\30\31\0"+
    "\11\30\6\64\1\0\5\30\2\0\5\30\4\0\126\30"+
    "\2\0\2\64\2\0\3\30\1\0\132\30\1\0\4\30"+
    "\5\0\53\30\1\0\136\30\21\0\33\30\65\0\306\30"+
    "\112\0\360\30\20\0\215\30\103\0\56\30\2\0\15\30"+
    "\3\0\20\30\12\64\2\30\24\0\57\30\1\64\4\0"+
    "\12\64\1\0\37\30\2\64\120\30\2\64\45\0\11\30"+
    "\2\0\147\30\2\0\65\30\2\0\5\30\60\0\13\30"+
    "\1\64\3\30\1\64\4\30\1\64\27\30\5\64\30\0"+
    "\64\30\14\0\2\64\62\30\22\64\12\0\12\64\6\0"+
    "\22\64\6\30\3\0\1\30\1\0\2\30\13\64\34\30"+
    "\10\64\2\0\27\30\15\64\14\0\35\30\3\0\4\64"+
    "\57\30\16\64\16\0\1\30\12\64\6\0\5\30\1\64"+
    "\12\30\12\64\5\30\1\0\51\30\16\64\11\0\3\30"+
    "\1\64\10\30\2\64\2\0\12\64\6\0\27\30\3\0"+
    "\1\30\3\64\62\30\1\64\1\30\3\64\2\30\2\64"+
    "\5\30\2\64\1\30\1\64\1\30\30\0\3\30\2\0"+
    "\13\30\5\64\2\0\3\30\2\64\12\0\6\30\2\0"+
    "\6\30\2\0\6\30\11\0\7\30\1\0\7\30\1\0"+
    "\53\30\1\0\14\30\10\0\163\30\10\64\1\0\2\64"+
    "\2\0\12\64\6\0\244\30\14\0\27\30\4\0\61\30"+
    "\4\0\u0100\65\156\30\2\0\152\30\46\0\7\30\14\0"+
    "\5\30\5\0\1\30\1\64\12\30\1\0\15\30\1\0"+
    "\5\30\1\0\1\30\1\0\2\30\1\0\2\30\1\0"+
    "\154\30\41\0\213\30\6\0\332\30\22\0\100\30\2\0"+
    "\66\30\50\0\12\30\6\0\20\64\20\0\20\64\3\0"+
    "\2\64\30\0\3\64\41\0\1\30\1\0\1\30\3\0"+
    "\1\30\1\0\1\30\1\0\1\30\1\0\1\30\1\0"+
    "\176\30\23\0\12\64\7\0\32\30\4\0\1\64\1\0"+
    "\32\30\13\0\70\30\2\64\37\30\3\0\6\30\2\0"+
    "\6\30\2\0\6\30\2\0\3\30\43\0\14\30\1\0"+
    "\32\30\1\0\23\30\1\0\2\30\1\0\17\30\2\0"+
    "\16\30\42\0\173\30\105\0\65\30\210\0\1\64\202\0"+
    "\35\30\3\0\61\30\17\0\1\64\37\0\40\30\15\0"+
    "\36\30\5\0\46\30\5\64\5\0\36\30\2\0\44\30"+
    "\4\0\10\30\1\0\5\30\52\0\236\30\2\0\12\64"+
    "\6\0\44\30\4\0\44\30\4\0\50\30\10\0\64\30"+
    "\234\0\67\30\11\0\26\30\12\0\10\30\230\0\6\30"+
    "\2\0\1\30\1\0\54\30\1\0\2\30\3\0\1\30"+
    "\2\0\27\30\12\0\27\30\11\0\37\30\101\0\23\30"+
    "\1\0\2\30\12\0\26\30\12\0\32\30\106\0\70\30"+
    "\6\0\2\30\100\0\1\30\3\64\1\0\2\64\5\0"+
    "\4\64\4\30\1\0\3\30\1\0\35\30\2\0\3\64"+
    "\4\0\1\64\40\0\35\30\3\0\35\30\43\0\10\30"+
    "\1\0\34\30\2\64\31\0\66\30\12\0\26\30\12\0"+
    "\23\30\15\0\22\30\156\0\111\30\67\0\63\30\15\0"+
    "\63\30\15\0\44\30\4\64\10\0\12\64\306\0\35\30"+
    "\12\0\1\30\10\0\26\30\13\64\217\0\27\30\11\0"+
    "\3\64\65\30\17\64\37\0\12\64\17\0\4\64\55\30"+
    "\13\64\25\0\31\30\7\0\12\64\6\0\3\64\44\30"+
    "\16\64\1\0\12\64\4\0\1\30\2\64\11\0\43\30"+
    "\1\64\2\0\1\30\11\0\3\64\60\30\16\64\4\30"+
    "\4\0\4\64\3\0\12\64\1\30\1\0\1\30\43\0"+
    "\22\30\1\0\31\30\14\64\6\0\1\64\101\0\7\30"+
    "\1\0\1\30\1\0\4\30\1\0\17\30\1\0\12\30"+
    "\7\0\57\30\14\64\5\0\12\64\6\0\4\64\1\0"+
    "\10\30\2\0\2\30\2\0\26\30\1\0\7\30\1\0"+
    "\2\30\1\0\5\30\1\0\2\64\1\30\7\64\2\0"+
    "\2\64\2\0\3\64\2\0\1\30\6\0\1\64\5\0"+
    "\5\30\2\64\2\0\7\64\3\0\5\64\213\0\65\30"+
    "\22\64\4\30\5\0\12\64\4\0\1\64\1\30\40\0"+
    "\60\30\24\64\2\30\1\0\1\30\10\0\12\64\246\0"+
    "\57\30\7\64\2\0\11\64\27\0\4\30\2\64\42\0"+
    "\60\30\21\64\3\0\1\30\13\0\12\64\46\0\53\30"+
    "\15\64\1\30\7\0\12\64\66\0\33\30\2\0\17\64"+
    "\4\0\12\64\306\0\54\30\17\64\145\0\100\30\12\64"+
    "\25\0\1\30\240\0\10\30\2\0\47\30\7\64\2\0"+
    "\7\64\1\30\1\0\1\30\1\64\33\0\1\30\12\64"+
    "\50\30\7\64\1\30\4\64\10\0\1\64\10\0\1\30"+
    "\13\64\56\30\20\64\3\0\1\30\42\0\71\30\7\0"+
    "\11\30\1\0\45\30\10\64\1\0\10\64\1\30\17\0"+
    "\12\64\30\0\36\30\2\0\26\64\1\0\16\64\111\0"+
    "\7\30\1\0\2\30\1\0\46\30\6\64\3\0\1\64"+
    "\1\0\2\64\1\0\7\64\1\30\1\64\10\0\12\64"+
    "\6\0\6\30\1\0\2\30\1\0\40\30\5\64\1\0"+
    "\2\64\1\0\5\64\1\30\7\0\12\64\u0136\0\23\30"+
    "\4\64\11\0\232\30\146\0\157\30\21\0\304\30\274\0"+
    "\57\30\321\0\107\30\271\0\71\30\7\0\37\30\1\0"+
    "\12\64\146\0\36\30\2\0\5\64\13\0\60\30\7\64"+
    "\11\0\4\30\14\0\12\64\11\0\25\30\5\0\23\30"+
    "\260\0\100\30\200\0\113\30\4\0\1\64\1\30\67\64"+
    "\7\0\4\64\15\30\100\0\2\30\1\0\1\30\34\0"+
    "\370\30\10\0\363\30\15\0\37\30\61\0\3\30\21\0"+
    "\4\30\10\0\u018c\30\4\0\153\30\5\0\15\30\3\0"+
    "\11\30\7\0\12\30\3\0\2\64\306\0\5\64\3\0"+
    "\6\64\10\0\10\64\2\0\7\64\36\0\4\64\224\0"+
    "\3\64\273\0\125\30\1\0\107\30\1\0\2\30\2\0"+
    "\1\30\2\0\2\30\2\0\4\30\1\0\14\30\1\0"+
    "\1\30\1\0\7\30\1\0\101\30\1\0\4\30\2\0"+
    "\10\30\1\0\7\30\1\0\34\30\1\0\4\30\1\0"+
    "\5\30\1\0\1\30\3\0\7\30\1\0\u0154\30\2\0"+
    "\31\30\1\0\31\30\1\0\37\30\1\0\31\30\1\0"+
    "\37\30\1\0\31\30\1\0\37\30\1\0\31\30\1\0"+
    "\37\30\1\0\31\30\1\0\10\30\2\0\151\64\4\0"+
    "\62\64\10\0\1\64\16\0\1\64\26\0\5\64\1\0"+
    "\17\64\120\0\7\64\1\0\21\64\2\0\7\64\1\0"+
    "\2\64\1\0\5\64\325\0\55\30\3\0\7\64\7\30"+
    "\2\0\12\64\4\0\1\30\u0171\0\54\30\16\64\6\0"+
    "\305\30\13\0\7\64\51\0\104\30\7\64\1\30\4\0"+
    "\12\64\246\0\4\30\1\0\33\30\1\0\2\30\1\0"+
    "\1\30\2\0\1\30\1\0\12\30\1\0\4\30\1\0"+
    "\1\30\1\0\1\30\6\0\1\30\4\0\1\30\1\0"+
    "\1\30\1\0\1\30\1\0\3\30\1\0\2\30\1\0"+
    "\1\30\2\0\1\30\1\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\1\30\1\0\2\30\1\0\1\30\2\0"+
    "\4\30\1\0\7\30\1\0\4\30\1\0\4\30\1\0"+
    "\1\30\1\0\12\30\1\0\21\30\5\0\3\30\1\0"+
    "\5\30\1\0\21\30\104\0\327\30\51\0\65\30\13\0"+
    "\336\30\2\0\u0182\30\16\0\u0131\30\37\0\36\30\342\0"+
    "\360\64\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\1\1\27\1\30\1\1\12\25\1\31\1\32"+
    "\1\33\1\34\1\0\1\35\2\0\1\36\1\0\1\37"+
    "\2\0\1\40\1\0\1\41\1\0\1\42\1\25\1\43"+
    "\12\25\1\35\1\36\1\44\1\0\1\44\1\0\1\45"+
    "\14\25\1\46\2\0\2\25\1\47\6\25\1\50\1\25"+
    "\1\51\1\52\1\25\1\53\1\25\1\54\2\25\1\55"+
    "\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\66\0\66\0\330\0\66"+
    "\0\66\0\66\0\66\0\66\0\u010e\0\66\0\u0144\0\u017a"+
    "\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\u01b0"+
    "\0\66\0\u01e6\0\66\0\66\0\u021c\0\u0252\0\u0288\0\u02be"+
    "\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\66"+
    "\0\66\0\66\0\66\0\242\0\66\0\u046e\0\330\0\66"+
    "\0\u04a4\0\66\0\u04da\0\u0510\0\u0546\0\u057c\0\66\0\u021c"+
    "\0\66\0\u05b2\0\u01b0\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0"+
    "\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce\0\242\0\330\0\66"+
    "\0\u0804\0\u083a\0\u0870\0\u01b0\0\u08a6\0\u08dc\0\u0912\0\u0948"+
    "\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8"+
    "\0\66\0\u083a\0\u0b2e\0\u0b64\0\u0b9a\0\u01b0\0\u0bd0\0\u0c06"+
    "\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u01b0\0\u0d14\0\u01b0\0\u01b0"+
    "\0\u0d4a\0\u01b0\0\u0d80\0\u01b0\0\u0db6\0\u0dec\0\u01b0\0\u01b0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\30\1\37\1\40"+
    "\1\41\1\42\1\43\2\30\1\44\4\30\1\45\1\46"+
    "\1\47\1\30\1\50\1\51\1\52\1\53\2\2\67\0"+
    "\3\3\62\0\4\54\1\55\25\54\1\56\33\54\7\57"+
    "\1\60\22\57\1\61\33\57\25\0\1\62\40\0\12\63"+
    "\1\64\4\63\1\65\12\63\1\66\33\63\20\0\1\20"+
    "\65\0\1\30\7\0\1\30\5\0\22\30\4\0\1\30"+
    "\1\0\2\67\2\0\61\67\1\0\35\70\1\71\30\70"+
    "\20\0\1\30\7\0\1\30\5\0\12\30\1\72\3\30"+
    "\1\73\3\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\10\30\1\74\11\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\12\30\1\75\7\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\1\76\21\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\15\30\1\77"+
    "\4\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\11\30\1\100\10\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\1\101\21\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\17\30\1\102\2\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\13\30\1\103\1\30"+
    "\1\104\4\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\12\30\1\105\7\30\4\0\1\30\1\0\4\54"+
    "\1\106\25\54\1\56\33\54\7\57\1\107\22\57\1\61"+
    "\33\57\17\63\1\110\12\63\1\66\33\63\12\64\1\111"+
    "\4\64\1\112\12\64\1\113\33\64\2\65\1\0\63\65"+
    "\2\63\2\0\61\63\21\0\1\30\7\0\1\30\5\0"+
    "\21\30\1\114\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\1\115\5\30\1\116\13\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\20\30\1\117\1\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\10\30\1\120"+
    "\11\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\121\12\30\1\122\6\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\14\30\1\123\5\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\2\30\1\124\17\30"+
    "\4\0\1\30\21\0\1\30\7\0\1\30\5\0\15\30"+
    "\1\125\4\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\7\30\1\126\12\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\20\30\1\127\1\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\6\30\1\130\13\30"+
    "\4\0\1\30\1\0\12\64\1\111\4\64\1\131\12\64"+
    "\1\113\33\64\12\132\1\133\53\132\2\64\2\132\6\64"+
    "\1\111\52\64\1\132\20\0\1\30\7\0\1\30\5\0"+
    "\16\30\1\134\3\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\11\30\1\135\10\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\11\30\1\136\10\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\16\30\1\127"+
    "\3\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\11\30\1\137\10\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\20\30\1\140\1\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\13\30\1\141\6\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\15\30\1\142"+
    "\4\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\20\30\1\143\1\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\3\30\1\144\16\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\3\30\1\145\16\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\13\30\1\146"+
    "\6\30\4\0\1\30\1\0\12\132\1\133\4\132\1\131"+
    "\46\132\20\0\1\30\7\0\1\30\5\0\16\30\1\147"+
    "\3\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\30\1\150\20\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\11\30\1\151\10\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\14\30\1\152\5\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\15\30\1\153"+
    "\4\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\13\30\1\154\6\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\2\30\1\155\17\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\12\30\1\152\7\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\12\30\1\136"+
    "\7\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\156\21\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\17\30\1\157\2\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\17\30\1\147\2\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\15\30\1\160\4\30"+
    "\4\0\1\30\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3618];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\1\1\5\11\1\1\1\11"+
    "\2\1\7\11\1\1\1\11\1\1\2\11\13\1\4\11"+
    "\1\0\1\11\2\0\1\11\1\0\1\11\2\0\1\1"+
    "\1\0\1\11\1\0\1\11\16\1\1\11\1\0\1\1"+
    "\1\0\15\1\1\11\2\0\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _YggdrasilLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 47: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 48: break;
          case 3:
            { return HASH;
            }
          // fall through
          case 49: break;
          case 4:
            { return DOLLAR;
            }
          // fall through
          case 50: break;
          case 5:
            { return PARENTHESIS_L;
            }
          // fall through
          case 51: break;
          case 6:
            { return PARENTHESIS_R;
            }
          // fall through
          case 52: break;
          case 7:
            { return OP_MANY;
            }
          // fall through
          case 53: break;
          case 8:
            { return OP_MANY1;
            }
          // fall through
          case 54: break;
          case 9:
            { return COMMA;
            }
          // fall through
          case 55: break;
          case 10:
            { return HYPHEN;
            }
          // fall through
          case 56: break;
          case 11:
            { return DOT;
            }
          // fall through
          case 57: break;
          case 12:
            { return SLASH;
            }
          // fall through
          case 58: break;
          case 13:
            { return INTEGER;
            }
          // fall through
          case 59: break;
          case 14:
            { return COLON;
            }
          // fall through
          case 60: break;
          case 15:
            { return SEMICOLON;
            }
          // fall through
          case 61: break;
          case 16:
            { return ANGLE_L;
            }
          // fall through
          case 62: break;
          case 17:
            { return EQ;
            }
          // fall through
          case 63: break;
          case 18:
            { return ANGLE_R;
            }
          // fall through
          case 64: break;
          case 19:
            { return OP_OPTIONAL;
            }
          // fall through
          case 65: break;
          case 20:
            { return AT;
            }
          // fall through
          case 66: break;
          case 21:
            { return SYMBOL;
            }
          // fall through
          case 67: break;
          case 22:
            { return BRACKET_L;
            }
          // fall through
          case 68: break;
          case 23:
            { return BRACKET_R;
            }
          // fall through
          case 69: break;
          case 24:
            { return ACCENT;
            }
          // fall through
          case 70: break;
          case 25:
            { return BRACE_L;
            }
          // fall through
          case 71: break;
          case 26:
            { return OP_OR;
            }
          // fall through
          case 72: break;
          case 27:
            { return BRACE_R;
            }
          // fall through
          case 73: break;
          case 28:
            { return OP_CONCAT;
            }
          // fall through
          case 74: break;
          case 29:
            { return TEXT_DOUBLE;
            }
          // fall through
          case 75: break;
          case 30:
            { return TEXT_SINGLE;
            }
          // fall through
          case 76: break;
          case 31:
            { return TO;
            }
          // fall through
          case 77: break;
          case 32:
            { return COMMENT_LINE;
            }
          // fall through
          case 78: break;
          case 33:
            { return ESCAPED;
            }
          // fall through
          case 79: break;
          case 34:
            { return SYMBOW_RAW;
            }
          // fall through
          case 80: break;
          case 35:
            { return KW_AS;
            }
          // fall through
          case 81: break;
          case 36:
            { return REGULAR_EXPRESSION;
            }
          // fall through
          case 82: break;
          case 37:
            { return KW_ANY;
            }
          // fall through
          case 83: break;
          case 38:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 84: break;
          case 39:
            { return KW_UNION;
            }
          // fall through
          case 85: break;
          case 40:
            { return KW_BOOLEAN;
            }
          // fall through
          case 86: break;
          case 41:
            { return KW_CLASS;
            }
          // fall through
          case 87: break;
          case 42:
            { return KW_CLIMB;
            }
          // fall through
          case 88: break;
          case 43:
            { return KW_GROUP;
            }
          // fall through
          case 89: break;
          case 44:
            { return KW_MACRO;
            }
          // fall through
          case 90: break;
          case 45:
            { return KW_IMPORT;
            }
          // fall through
          case 91: break;
          case 46:
            { return KW_GRAMMAR;
            }
          // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}