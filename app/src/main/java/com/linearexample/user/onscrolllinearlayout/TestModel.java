package com.linearexample.user.onscrolllinearlayout;

import java.util.List;


public class TestModel {



    private MetaEntity meta;


    private PaginationEntity pagination;


    private List<DataEntity> data;

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public void setPagination(PaginationEntity pagination) {
        this.pagination = pagination;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public PaginationEntity getPagination() {
        return pagination;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class MetaEntity {
        private int status;
        private String msg;

        public void setStatus(int status) {
            this.status = status;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getStatus() {
            return status;
        }

        public String getMsg() {
            return msg;
        }
    }

    public static class PaginationEntity {
        private int total_count;
        private int count;
        private int offset;

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getTotal_count() {
            return total_count;
        }

        public int getCount() {
            return count;
        }

        public int getOffset() {
            return offset;
        }
    }

    public static class DataEntity {
        private String type;
        private String id;
        private String slug;
        private String url;
        private String bitly_gif_url;
        private String bitly_url;
        private String embed_url;
        private String username;
        private String source;
        private String rating;
        private String content_url;
        private String source_tld;
        private String source_post_url;
        private String import_datetime;
        private String trending_datetime;


        private ImagesEntity images;

        public void setType(String type) {
            this.type = type;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setBitly_gif_url(String bitly_gif_url) {
            this.bitly_gif_url = bitly_gif_url;
        }

        public void setBitly_url(String bitly_url) {
            this.bitly_url = bitly_url;
        }

        public void setEmbed_url(String embed_url) {
            this.embed_url = embed_url;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public void setContent_url(String content_url) {
            this.content_url = content_url;
        }

        public void setSource_tld(String source_tld) {
            this.source_tld = source_tld;
        }

        public void setSource_post_url(String source_post_url) {
            this.source_post_url = source_post_url;
        }

        public void setImport_datetime(String import_datetime) {
            this.import_datetime = import_datetime;
        }

        public void setTrending_datetime(String trending_datetime) {
            this.trending_datetime = trending_datetime;
        }

        public void setImages(ImagesEntity images) {
            this.images = images;
        }

        public String getType() {
            return type;
        }

        public String getId() {
            return id;
        }

        public String getSlug() {
            return slug;
        }

        public String getUrl() {
            return url;
        }

        public String getBitly_gif_url() {
            return bitly_gif_url;
        }

        public String getBitly_url() {
            return bitly_url;
        }

        public String getEmbed_url() {
            return embed_url;
        }

        public String getUsername() {
            return username;
        }

        public String getSource() {
            return source;
        }

        public String getRating() {
            return rating;
        }

        public String getContent_url() {
            return content_url;
        }

        public String getSource_tld() {
            return source_tld;
        }

        public String getSource_post_url() {
            return source_post_url;
        }

        public String getImport_datetime() {
            return import_datetime;
        }

        public String getTrending_datetime() {
            return trending_datetime;
        }

        public ImagesEntity getImages() {
            return images;
        }

        public static class ImagesEntity {


            private FixedHeightEntity fixed_height;

            private FixedHeightStillEntity fixed_height_still;


            private FixedHeightDownsampledEntity fixed_height_downsampled;


            private FixedWidthEntity fixed_width;


            private FixedWidthStillEntity fixed_width_still;


            private FixedWidthDownsampledEntity fixed_width_downsampled;


            private FixedHeightSmallEntity fixed_height_small;


            private FixedHeightSmallStillEntity fixed_height_small_still;


            private FixedWidthSmallEntity fixed_width_small;


            private FixedWidthSmallStillEntity fixed_width_small_still;


            private DownsizedEntity downsized;

            private DownsizedStillEntity downsized_still;


            private DownsizedLargeEntity downsized_large;


            private DownsizedMediumEntity downsized_medium;


            private OriginalEntity original;


            private OriginalStillEntity original_still;


            private LoopingEntity looping;

            public void setFixed_height(FixedHeightEntity fixed_height) {
                this.fixed_height = fixed_height;
            }

            public void setFixed_height_still(FixedHeightStillEntity fixed_height_still) {
                this.fixed_height_still = fixed_height_still;
            }

            public void setFixed_height_downsampled(FixedHeightDownsampledEntity fixed_height_downsampled) {
                this.fixed_height_downsampled = fixed_height_downsampled;
            }

            public void setFixed_width(FixedWidthEntity fixed_width) {
                this.fixed_width = fixed_width;
            }

            public void setFixed_width_still(FixedWidthStillEntity fixed_width_still) {
                this.fixed_width_still = fixed_width_still;
            }

            public void setFixed_width_downsampled(FixedWidthDownsampledEntity fixed_width_downsampled) {
                this.fixed_width_downsampled = fixed_width_downsampled;
            }

            public void setFixed_height_small(FixedHeightSmallEntity fixed_height_small) {
                this.fixed_height_small = fixed_height_small;
            }

            public void setFixed_height_small_still(FixedHeightSmallStillEntity fixed_height_small_still) {
                this.fixed_height_small_still = fixed_height_small_still;
            }

            public void setFixed_width_small(FixedWidthSmallEntity fixed_width_small) {
                this.fixed_width_small = fixed_width_small;
            }

            public void setFixed_width_small_still(FixedWidthSmallStillEntity fixed_width_small_still) {
                this.fixed_width_small_still = fixed_width_small_still;
            }

            public void setDownsized(DownsizedEntity downsized) {
                this.downsized = downsized;
            }

            public void setDownsized_still(DownsizedStillEntity downsized_still) {
                this.downsized_still = downsized_still;
            }

            public void setDownsized_large(DownsizedLargeEntity downsized_large) {
                this.downsized_large = downsized_large;
            }

            public void setDownsized_medium(DownsizedMediumEntity downsized_medium) {
                this.downsized_medium = downsized_medium;
            }

            public void setOriginal(OriginalEntity original) {
                this.original = original;
            }

            public void setOriginal_still(OriginalStillEntity original_still) {
                this.original_still = original_still;
            }

            public void setLooping(LoopingEntity looping) {
                this.looping = looping;
            }

            public FixedHeightEntity getFixed_height() {
                return fixed_height;
            }

            public FixedHeightStillEntity getFixed_height_still() {
                return fixed_height_still;
            }

            public FixedHeightDownsampledEntity getFixed_height_downsampled() {
                return fixed_height_downsampled;
            }

            public FixedWidthEntity getFixed_width() {
                return fixed_width;
            }

            public FixedWidthStillEntity getFixed_width_still() {
                return fixed_width_still;
            }

            public FixedWidthDownsampledEntity getFixed_width_downsampled() {
                return fixed_width_downsampled;
            }

            public FixedHeightSmallEntity getFixed_height_small() {
                return fixed_height_small;
            }

            public FixedHeightSmallStillEntity getFixed_height_small_still() {
                return fixed_height_small_still;
            }

            public FixedWidthSmallEntity getFixed_width_small() {
                return fixed_width_small;
            }

            public FixedWidthSmallStillEntity getFixed_width_small_still() {
                return fixed_width_small_still;
            }

            public DownsizedEntity getDownsized() {
                return downsized;
            }

            public DownsizedStillEntity getDownsized_still() {
                return downsized_still;
            }

            public DownsizedLargeEntity getDownsized_large() {
                return downsized_large;
            }

            public DownsizedMediumEntity getDownsized_medium() {
                return downsized_medium;
            }

            public OriginalEntity getOriginal() {
                return original;
            }

            public OriginalStillEntity getOriginal_still() {
                return original_still;
            }

            public LoopingEntity getLooping() {
                return looping;
            }

            public static class FixedHeightEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String mp4;
                private String mp4_size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getMp4_size() {
                    return mp4_size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedHeightStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class FixedHeightDownsampledEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedWidthEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String mp4;
                private String mp4_size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getMp4_size() {
                    return mp4_size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedWidthStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class FixedWidthDownsampledEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedHeightSmallEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String mp4;
                private String mp4_size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getMp4_size() {
                    return mp4_size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedHeightSmallStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class FixedWidthSmallEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String mp4;
                private String mp4_size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getMp4_size() {
                    return mp4_size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class FixedWidthSmallStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class DownsizedEntity {
                private String url;
                private String width;
                private String height;
                private String size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class DownsizedStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class DownsizedLargeEntity {
                private String url;
                private String width;
                private String height;
                private String size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class DownsizedMediumEntity {
                private String url;
                private String width;
                private String height;
                private String size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class OriginalEntity {
                private String url;
                private String width;
                private String height;
                private String size;
                private String frames;
                private String mp4;
                private String mp4_size;
                private String webp;
                private String webp_size;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public void setFrames(String frames) {
                    this.frames = frames;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }

                public String getSize() {
                    return size;
                }

                public String getFrames() {
                    return frames;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getMp4_size() {
                    return mp4_size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getWebp_size() {
                    return webp_size;
                }
            }

            public static class OriginalStillEntity {
                private String url;
                private String width;
                private String height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public String getWidth() {
                    return width;
                }

                public String getHeight() {
                    return height;
                }
            }

            public static class LoopingEntity {
                private String mp4;

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public String getMp4() {
                    return mp4;
                }
            }
        }
    }
}

