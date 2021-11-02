/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecH264 {

    /** The extension specification version. */
    public static final int VK_STD_VULKAN_VIDEO_CODEC_H264_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(0, 9, 5);

    /** The extension name. */
    public static final String VK_STD_VULKAN_VIDEO_CODEC_H264_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h264";

    public static final int
        STD_VIDEO_H264_CPB_CNT_LIST_SIZE             = 32,
        STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS    = 6,
        STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS = 16,
        STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS    = 2,
        STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS = 64;

    /**
     * {@code StdVideoH264ChromaFormatIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_CHROMA_FORMAT_IDC_MONOCHROME VIDEO_H264_CHROMA_FORMAT_IDC_MONOCHROME}</li>
     * <li>{@link #STD_VIDEO_H264_CHROMA_FORMAT_IDC_420 VIDEO_H264_CHROMA_FORMAT_IDC_420}</li>
     * <li>{@link #STD_VIDEO_H264_CHROMA_FORMAT_IDC_422 VIDEO_H264_CHROMA_FORMAT_IDC_422}</li>
     * <li>{@link #STD_VIDEO_H264_CHROMA_FORMAT_IDC_444 VIDEO_H264_CHROMA_FORMAT_IDC_444}</li>
     * <li>{@link #STD_VIDEO_H264_CHROMA_FORMAT_IDC_INVALID VIDEO_H264_CHROMA_FORMAT_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_CHROMA_FORMAT_IDC_MONOCHROME = 0,
        STD_VIDEO_H264_CHROMA_FORMAT_IDC_420        = 1,
        STD_VIDEO_H264_CHROMA_FORMAT_IDC_422        = 2,
        STD_VIDEO_H264_CHROMA_FORMAT_IDC_444        = 3,
        STD_VIDEO_H264_CHROMA_FORMAT_IDC_INVALID    = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264ProfileIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_PROFILE_IDC_BASELINE VIDEO_H264_PROFILE_IDC_BASELINE} - Only constrained baseSTline is supported</li>
     * <li>{@link #STD_VIDEO_H264_PROFILE_IDC_MAIN VIDEO_H264_PROFILE_IDC_MAIN}</li>
     * <li>{@link #STD_VIDEO_H264_PROFILE_IDC_HIGH VIDEO_H264_PROFILE_IDC_HIGH}</li>
     * <li>{@link #STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE}</li>
     * <li>{@link #STD_VIDEO_H264_PROFILE_IDC_INVALID VIDEO_H264_PROFILE_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_PROFILE_IDC_BASELINE            = 66,
        STD_VIDEO_H264_PROFILE_IDC_MAIN                = 77,
        STD_VIDEO_H264_PROFILE_IDC_HIGH                = 100,
        STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE = 244,
        STD_VIDEO_H264_PROFILE_IDC_INVALID             = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264Level}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_LEVEL_1_0 VIDEO_H264_LEVEL_1_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_1_1 VIDEO_H264_LEVEL_1_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_1_2 VIDEO_H264_LEVEL_1_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_1_3 VIDEO_H264_LEVEL_1_3}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_2_0 VIDEO_H264_LEVEL_2_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_2_1 VIDEO_H264_LEVEL_2_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_2_2 VIDEO_H264_LEVEL_2_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_3_0 VIDEO_H264_LEVEL_3_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_3_1 VIDEO_H264_LEVEL_3_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_3_2 VIDEO_H264_LEVEL_3_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_4_0 VIDEO_H264_LEVEL_4_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_4_1 VIDEO_H264_LEVEL_4_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_4_2 VIDEO_H264_LEVEL_4_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_5_0 VIDEO_H264_LEVEL_5_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_5_1 VIDEO_H264_LEVEL_5_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_5_2 VIDEO_H264_LEVEL_5_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_6_0 VIDEO_H264_LEVEL_6_0}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_6_1 VIDEO_H264_LEVEL_6_1}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_6_2 VIDEO_H264_LEVEL_6_2}</li>
     * <li>{@link #STD_VIDEO_H264_LEVEL_INVALID VIDEO_H264_LEVEL_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_LEVEL_1_0     = 0,
        STD_VIDEO_H264_LEVEL_1_1     = 1,
        STD_VIDEO_H264_LEVEL_1_2     = 2,
        STD_VIDEO_H264_LEVEL_1_3     = 3,
        STD_VIDEO_H264_LEVEL_2_0     = 4,
        STD_VIDEO_H264_LEVEL_2_1     = 5,
        STD_VIDEO_H264_LEVEL_2_2     = 6,
        STD_VIDEO_H264_LEVEL_3_0     = 7,
        STD_VIDEO_H264_LEVEL_3_1     = 8,
        STD_VIDEO_H264_LEVEL_3_2     = 9,
        STD_VIDEO_H264_LEVEL_4_0     = 10,
        STD_VIDEO_H264_LEVEL_4_1     = 11,
        STD_VIDEO_H264_LEVEL_4_2     = 12,
        STD_VIDEO_H264_LEVEL_5_0     = 13,
        STD_VIDEO_H264_LEVEL_5_1     = 14,
        STD_VIDEO_H264_LEVEL_5_2     = 15,
        STD_VIDEO_H264_LEVEL_6_0     = 16,
        STD_VIDEO_H264_LEVEL_6_1     = 17,
        STD_VIDEO_H264_LEVEL_6_2     = 18,
        STD_VIDEO_H264_LEVEL_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264PocType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_POC_TYPE_0 VIDEO_H264_POC_TYPE_0}</li>
     * <li>{@link #STD_VIDEO_H264_POC_TYPE_1 VIDEO_H264_POC_TYPE_1}</li>
     * <li>{@link #STD_VIDEO_H264_POC_TYPE_2 VIDEO_H264_POC_TYPE_2}</li>
     * <li>{@link #STD_VIDEO_H264_POC_TYPE_INVALID VIDEO_H264_POC_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_POC_TYPE_0       = 0,
        STD_VIDEO_H264_POC_TYPE_1       = 1,
        STD_VIDEO_H264_POC_TYPE_2       = 2,
        STD_VIDEO_H264_POC_TYPE_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264AspectRatioIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_UNSPECIFIED VIDEO_H264_ASPECT_RATIO_IDC_UNSPECIFIED}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_SQUARE VIDEO_H264_ASPECT_RATIO_IDC_SQUARE}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_12_11 VIDEO_H264_ASPECT_RATIO_IDC_12_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_10_11 VIDEO_H264_ASPECT_RATIO_IDC_10_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_16_11 VIDEO_H264_ASPECT_RATIO_IDC_16_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_40_33 VIDEO_H264_ASPECT_RATIO_IDC_40_33}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_24_11 VIDEO_H264_ASPECT_RATIO_IDC_24_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_20_11 VIDEO_H264_ASPECT_RATIO_IDC_20_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_32_11 VIDEO_H264_ASPECT_RATIO_IDC_32_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_80_33 VIDEO_H264_ASPECT_RATIO_IDC_80_33}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_18_11 VIDEO_H264_ASPECT_RATIO_IDC_18_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_15_11 VIDEO_H264_ASPECT_RATIO_IDC_15_11}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_64_33 VIDEO_H264_ASPECT_RATIO_IDC_64_33}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_160_99 VIDEO_H264_ASPECT_RATIO_IDC_160_99}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_4_3 VIDEO_H264_ASPECT_RATIO_IDC_4_3}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_3_2 VIDEO_H264_ASPECT_RATIO_IDC_3_2}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_2_1 VIDEO_H264_ASPECT_RATIO_IDC_2_1}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_EXTENDED_SAR VIDEO_H264_ASPECT_RATIO_IDC_EXTENDED_SAR}</li>
     * <li>{@link #STD_VIDEO_H264_ASPECT_RATIO_IDC_INVALID VIDEO_H264_ASPECT_RATIO_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_ASPECT_RATIO_IDC_UNSPECIFIED  = 0,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_SQUARE       = 1,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_12_11        = 2,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_10_11        = 3,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_16_11        = 4,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_40_33        = 5,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_24_11        = 6,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_20_11        = 7,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_32_11        = 8,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_80_33        = 9,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_18_11        = 10,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_15_11        = 11,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_64_33        = 12,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_160_99       = 13,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_4_3          = 14,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_3_2          = 15,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_2_1          = 16,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_EXTENDED_SAR = 255,
        STD_VIDEO_H264_ASPECT_RATIO_IDC_INVALID      = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264WeightedBipredIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT}</li>
     * <li>{@link #STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT}</li>
     * <li>{@link #STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT}</li>
     * <li>{@link #STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT  = 0,
        STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT = 1,
        STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT = 2,
        STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID  = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264ModificationOfPicNumsIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT}</li>
     * <li>{@link #STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD}</li>
     * <li>{@link #STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM}</li>
     * <li>{@link #STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_END VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_END}</li>
     * <li>{@link #STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT = 0,
        STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD      = 1,
        STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM           = 2,
        STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_END                 = 3,
        STD_VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID             = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264MemMgmtControlOp}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END VIDEO_H264_MEM_MGMT_CONTROL_OP_END}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM}</li>
     * <li>{@link #STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END                       = 0,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM         = 1,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM          = 2,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM            = 3,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX   = 4,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL                = 5,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM = 6,
        STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID                   = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264CabacInitIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_CABAC_INIT_IDC_0 VIDEO_H264_CABAC_INIT_IDC_0}</li>
     * <li>{@link #STD_VIDEO_H264_CABAC_INIT_IDC_1 VIDEO_H264_CABAC_INIT_IDC_1}</li>
     * <li>{@link #STD_VIDEO_H264_CABAC_INIT_IDC_2 VIDEO_H264_CABAC_INIT_IDC_2}</li>
     * <li>{@link #STD_VIDEO_H264_CABAC_INIT_IDC_INVALID VIDEO_H264_CABAC_INIT_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_CABAC_INIT_IDC_0       = 0,
        STD_VIDEO_H264_CABAC_INIT_IDC_1       = 1,
        STD_VIDEO_H264_CABAC_INIT_IDC_2       = 2,
        STD_VIDEO_H264_CABAC_INIT_IDC_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264DisableDeblockingFilterIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED}</li>
     * <li>{@link #STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED}</li>
     * <li>{@link #STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL}</li>
     * <li>{@link #STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED = 0,
        STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED  = 1,
        STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL  = 2,
        STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID  = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264SliceType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_SLICE_TYPE_P VIDEO_H264_SLICE_TYPE_P}</li>
     * <li>{@link #STD_VIDEO_H264_SLICE_TYPE_B VIDEO_H264_SLICE_TYPE_B}</li>
     * <li>{@link #STD_VIDEO_H264_SLICE_TYPE_I VIDEO_H264_SLICE_TYPE_I}</li>
     * <li>{@link #STD_VIDEO_H264_SLICE_TYPE_INVALID VIDEO_H264_SLICE_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_SLICE_TYPE_P       = 0,
        STD_VIDEO_H264_SLICE_TYPE_B       = 1,
        STD_VIDEO_H264_SLICE_TYPE_I       = 2,
        STD_VIDEO_H264_SLICE_TYPE_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264PictureType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_PICTURE_TYPE_P VIDEO_H264_PICTURE_TYPE_P}</li>
     * <li>{@link #STD_VIDEO_H264_PICTURE_TYPE_B VIDEO_H264_PICTURE_TYPE_B}</li>
     * <li>{@link #STD_VIDEO_H264_PICTURE_TYPE_I VIDEO_H264_PICTURE_TYPE_I}</li>
     * <li>{@link #STD_VIDEO_H264_PICTURE_TYPE_IDR VIDEO_H264_PICTURE_TYPE_IDR}</li>
     * <li>{@link #STD_VIDEO_H264_PICTURE_TYPE_INVALID VIDEO_H264_PICTURE_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_PICTURE_TYPE_P       = 0,
        STD_VIDEO_H264_PICTURE_TYPE_B       = 1,
        STD_VIDEO_H264_PICTURE_TYPE_I       = 2,
        STD_VIDEO_H264_PICTURE_TYPE_IDR     = 5,
        STD_VIDEO_H264_PICTURE_TYPE_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264NonVclNaluType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_SPS VIDEO_H264_NON_VCL_NALU_TYPE_SPS}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_PPS VIDEO_H264_NON_VCL_NALU_TYPE_PPS}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_AUD VIDEO_H264_NON_VCL_NALU_TYPE_AUD}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_PREFIX VIDEO_H264_NON_VCL_NALU_TYPE_PREFIX}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_STREAM VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_STREAM}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_PRECODED VIDEO_H264_NON_VCL_NALU_TYPE_PRECODED}</li>
     * <li>{@link #STD_VIDEO_H264_NON_VCL_NALU_TYPE_INVALID VIDEO_H264_NON_VCL_NALU_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_SPS             = 0,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_PPS             = 1,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_AUD             = 2,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_PREFIX          = 3,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE = 4,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_STREAM   = 5,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_PRECODED        = 6,
        STD_VIDEO_H264_NON_VCL_NALU_TYPE_INVALID         = 0x7FFFFFFF;

    public static final int STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE = 15;

    /**
     * {@code StdVideoDecodeH264FieldOrderCount}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP}</li>
     * <li>{@link #STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM}</li>
     * <li>{@link #STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE}</li>
     * <li>{@link #STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP       = 0,
        STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM    = 1,
        STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE = 2,
        STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID   = 0x7FFFFFFF;

    private STDVulkanVideoCodecH264() {}

}