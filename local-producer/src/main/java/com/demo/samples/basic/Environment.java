/*Copyright (c) 2021 Oracle and/or its affiliates.
The Universal Permissive License (UPL), Version 1.0
Subject to the condition set forth below, permission is hereby granted to any
person obtaining a copy of this software, associated documentation and/or data
(collectively the "Software"), free of charge and under any and all copyright
rights in the Software, and any and all patent rights owned or freely
licensable by each licensor hereunder covering either (i) the unmodified
Software as contributed to or provided by such licensor, or (ii) the Larger
Works (as defined below), to deal in both
(a) the Software, and
(b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
one is included with the Software (each a "Larger Work" to which the Software
is contributed by such licensors),
without restriction, including without limitation the rights to copy, create
derivative works of, display, perform, and distribute the Software and make,
use, sell, offer for sale, import, export, have made, and have sold the
Software and the Larger Work(s), and to sublicense the foregoing rights on
either these or other terms.
This license is subject to the following condition:
The above copyright notice and either this complete permission notice or at
a minimum a reference to the UPL must be included in all copies or
substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package com.demo.samples.basic;

public class Environment {

	// Data Plane API's endpoints for PHX, please replace it for other regions
	
	public static String _DP_ENDPOINT = "https://cell-1.queue.messaging.us-ashburn-1.oci.oraclecloud.com";

	// values below are required if you are using user private key 
	
	public static String _TENANT_ID = "ocid1.tenancy.oc1..aaaaaaaazk5fzn3nj4hrz5qgki6tdvhtzmkgggyspun5cyogx24bngwehgma";
	public static String _USER_ID = "ocid1.user.oc1..aaaaaaaa7zymmgakld7af5aw64zgqtsw23xwflnm4xidt2lei2tirdhcx2sa";
	public static String _FINGER_PRINT = "82:fb:77:26:d7:b7:fb:78:ee:2d:99:0f:9a:32:6a:92";
	public static String _PVT_KEY_FILE_PATH = "/home/opc/.oci/oci_api_key.pem";

	// Get the _QUEUE_ID after creating the Queue
	public static String _QUEUE_ID = "ocid1.queue.oc1.iad.amaaaaaaj6ty54aaabrmdjhf76p7fhyd3lev2exbvlxk4qoctwexn6dn2fna";

	
}

